$ ->
	$("#btnTest").click -> 
		$("#notices").empty()
		$.get "/notices", (data) ->
    		$.each data, (index, notice) -> createNotice notice
      			

# Create a dynamic notice
createNotice = (notice) ->
	$("#notices").append $("<div>")
	.html("<a class=\"close\" data-dismiss=\"alert\" href=\"#\">&times;</a>")
    .append(notice.message)
    .addClass("alert fade in alert-" + notice.kind)
