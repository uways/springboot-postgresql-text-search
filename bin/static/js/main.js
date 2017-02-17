var xhr = new XMLHttpRequest()

// initialize
var book_autoComplete =
new autoComplete({
    selector: 'input[name="q"]',
    minChars: 3,
    source: function(term, suggest) {
        try { xhr.abort(); } catch(e){}

        xhr.onreadystatechange = function() {
          if (this.readyState === 4) {
            if (this.status >= 200 && this.status < 400) {
              suggest(JSON.parse(xhr.responseText))
            } else {
              // Error :(
            }
          }
        }
        xhr.open("GET", "/find?name="+term)
        xhr.send(null)
    }
})
