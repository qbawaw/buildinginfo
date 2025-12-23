const fetchBtn = document.getElementById("fetchBtn");
const locationData = document.getElementById("locationData");

function normalfetch(elementId){
    fetch(`/api/locations/${elementId}`)
        .then(res => {
            if (!res.ok) throw new Error("Location not found");
            return res.json();
        })
        .then(data => {
            document.getElementById(elementId).textContent = data[elementId];
        });
}
normalfetch("all_id")


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
    function fetchDatastring(elementId) {
        return fetch(`/api/locations/${locationId}/${elementId}`)
            .then(res => {
                if (!res.ok) throw new Error("Location not found");
                return res.json();
            })
            .then(data => {
                document.getElementById(elementId).textContent = data[elementId];
            });
    }
    fetchDatastring("children"),
    fetchDatastring("type"),
    fetchData("area"),
    fetchData("cube"),
    fetchData("light-per-area"),
    fetchData("heating-per-cube")
    locationData.style.display = "block";
});
