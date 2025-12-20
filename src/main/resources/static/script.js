const fetchBtn = document.getElementById("fetchBtn");
const locationData = document.getElementById("locationData");

fetchBtn.addEventListener("click", () => {
    const locationId = document.getElementById("locationIdInput").value;

    function fetchData(elementId) {
        return fetch(`/api/locations/${locationId}/${elementId}`)
            .then(res => {
                if (!res.ok) throw new Error("Location not found");
                return res.json();
            })
            .then(data => document.getElementById(elementId).textContent = data);
    }
    Promise.all([
        fetchData("area"),
        fetchData("cube"),
        fetchData("light-per-area"),
        fetchData("heating-per-cube")
    ])
        .then(() => {
            locationData.style.display = "block";
        })
        .catch(err => {
            alert("Location not found!");
        });
});
