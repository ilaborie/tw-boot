# Initialize
$ ->
  # Show Notices Button
  $("#btnNotices").click -> 
    $("#notices").empty()
    $.get "/notices", (data) ->
      $.each data, (index, notice) -> createNotice notice
  # Show Modal Dialog Button
  $("#btnDialog").click -> 
    $.get "/dialog", (data) -> openModalDialog(data.title,data.message)
  # Plug autocomplete
  $("#fldAutoComplete").typeahead(
  	source: findAutocompleteValues
  )

# Create a dynamic notice
createNotice = (notice) ->
  $("#notices").append $("<div>")
  .html("<a class=\"close\" data-dismiss=\"alert\" href=\"#\">&times;</a>")
  .append(notice.message)
  .addClass("alert fade in alert-" + notice.kind)

# Open Modal
openModalDialog = (title,message) ->
  $("#modalDialog .modal-header h3").text(title)
  $("#modalDialog .modal-body p").text(message)
  $("#modalDialog").modal()

# Autocompletion
findAutocompleteValues = (typeahead, query) ->
  $.get("/autocomplete?query=" +query, (data) ->
  	typeahead.process(data)
  )