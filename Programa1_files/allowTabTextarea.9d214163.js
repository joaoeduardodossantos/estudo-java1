for(var textareas=document.querySelectorAll("textarea"),i=0;i<textareas.length;i++){var input=textareas[i];input.addEventListener("keydown",function(a){if(9==a.keyCode||9==a.which){a.preventDefault();var b=this.selectionStart;this.value=this.value.substring(0,this.selectionStart)+"	"+this.value.substring(this.selectionEnd),this.selectionEnd=b+1}})}