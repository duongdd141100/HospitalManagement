const rowDatas = document.getElementsByClassName("row-data");

// Get the modal
const modal = document.getElementById("myModal");

for (let i = 0; i < rowDatas.length; i++) {
  rowDatas[i].onclick = function () {
      document.getElementById("id").value = document.getElementsByClassName("id")[i].textContent;
    modal.style.display = "block";
    
  };
}

// Get the <span> element that closes the modal
const span = document.getElementsByClassName("close")[0];

// When the user clicks on <span> (x), close the modal
span.onclick = function () {
  modal.style.display = "none";
};

// When the user clicks anywhere outside of the modal, close it
window.onclick = function (event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
};
