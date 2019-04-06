/*let text = document.querySelector('#inputText').value;
let btn = document.querySelector('.btn');
let output = "";
btn.addEventListener('click', function () {
  console.log(text.val);
})*/

function displayEnteredText() {
    let dis = document.getElementById('dis')
    let diver = document.getElementById('diver')
    let inputText = document.getElementById("inputText"); // get the element with id "input" which is the textField
    if (inputText.value == "") {
      alert("Enter an amount");
    }
    else if (inputText.value >= 1000 && inputText.value <= 50000) {
      document.getElementById('diver').value = "";
      document.getElementById('dis').value = "";
      let x = inputText.value;
      let y = 0.02 * x;
      let z = +x + +y;
      dis.value += `N${z}`
      let a = z / 12;
      diver.value += `N${a.toFixed(2)}`
        document.getElementById('inputText').value = "";
    }
    else if (inputText.value >= 50001 && inputText.value <= 200000) {
      document.getElementById('diver').value = "";
      document.getElementById('dis').value = "";
      let x = inputText.value;
      let y = 0.05 * x;
      let z = +x + +y;
      dis.value += `N${z}`
      let a = z / 12;
      diver.value += `N${a.toFixed(2)}`
        document.getElementById('inputText').value = "";
    }
    else if (inputText.value >= 200001 && inputText.value <= 500000) {
      document.getElementById('diver').value = "";
      document.getElementById('dis').value = "";
      let x = inputText.value;
      let y = 0.1 * x;
      let z = +x + +y;
      dis.value += `N${z}`
      let a = z / 12;
      diver.value += `N${a.toFixed(2)}`
        document.getElementById('inputText').value = "";
    }
    else if (inputText.value <= 999) {
      alert('We only borrow from 1000 and above.')
      document.getElementById('inputText').value = "";
    }
    else if (inputText.value >= 500001) {
      alert('Please use our PayLoan')
      document.getElementById('inputText').value = "";
    }
    else {
      alert('Enter an amount')
      document.getElementById('inputText').value = "";
    }

}










/*function add() {
  let a = document.getElementById('inputText').value;
  let b = document.getElementById('items');

  let tag = document.createElement('li');
  tag.innerHTML = a;

  b.append(tag);


  document.getElementById('inputText').value = "";
}*/
