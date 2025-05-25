document.querySelector("#registerBtn").onclick = () => alert("Registered!");

document.querySelector("#categorySelect").onchange = function () {
    console.log("Filtering category:", this.value);
};

document.querySelector("#searchInput").onkeydown = function (e) {
    if (e.key === "Enter") {
        console.log("Searching for:", e.target.value);
    }
};
