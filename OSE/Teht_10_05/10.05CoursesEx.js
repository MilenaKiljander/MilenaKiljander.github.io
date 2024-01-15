// The array of courses
let courses = [
    { name: "Introduction to Software Development", code: "SOF001IT1AE", extent: 5, timing: "1.semester" },
    { name: "Programming 1", code: "SOF005AS2AE", extent: 5, timing: "2.semester" },
    { name: "Programming 2", code: "SOF001AS3AE", extent: 5, timing: "2.semester" },
    { name: "Data Management and Databases", code: "SOF001AS2AE", extent: 5, timing: "2.semester" },
    { name: "Front End Programming", code: "SOF004AS3AE", extent: 5, timing: "3.semester" }
];

// Function to generate HTML for each course
function generateCourseHTML(course) {
    return `<p>Code: ${course.code}<br>Name: ${course.name}<br>Extent: ${course.extent}<br>Timing: ${course.timing}</p>`;
}

// Function to list courses and display them on the page
function listCourses() {
    // Get the element where the courses will be displayed
    const answerElement = document.getElementById('answer');

    // Clear previous content
    answerElement.innerHTML = '';

    // Generate HTML for each course and append it to the answerElement
    courses.forEach(course => {
        const courseHTML = generateCourseHTML(course);
        answerElement.innerHTML += courseHTML;
    });
}