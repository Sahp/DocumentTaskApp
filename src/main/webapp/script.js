$(document).ready(function() {
    updateList();

    $("#docForm").submit(function(event) {
        event.preventDefault();
        let docName = $("#docName").val();
        $.post("/DocumentTaskApp/DocumentTaskServlet", { action: "upload", docName: docName }, function() {
            updateList();
            $("#docName").val("");
        });
    });

    $("#taskForm").submit(function(event) {
        event.preventDefault();
        let taskName = $("#taskName").val();
        $.post("/DocumentTaskApp/DocumentTaskServlet", { action: "assign", taskName: taskName }, function() {
            updateList();
            $("#taskName").val("");
        });
    });

    function updateList() {
        $.get("/DocumentTaskApp/DocumentTaskServlet", function(data) {
            $("#list").html(data);
        });
    }
});