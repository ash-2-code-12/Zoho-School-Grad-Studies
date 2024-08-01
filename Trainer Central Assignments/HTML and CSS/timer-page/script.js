let startBtn = document.getElementById('startBtn');
let stopBtn = document.getElementById('stopBtn');
let resetBtn = document.getElementById('resetBtn');

let hoursEl = document.getElementById('hours');
let minutesEl = document.getElementById('minutes');
let secondsEl = document.getElementById('seconds');

let timerId;

function startTimer() {
    let seconds = parseInt(secondsEl.textContent);
    let minutes = parseInt(minutesEl.textContent);
    let hours = parseInt(hoursEl.textContent);

    seconds++;

    if (seconds === 60) {
        seconds = 0;
        minutes++;

        if (minutes === 60) {
            minutes = 0;
            hours++;

            if (hours === 24) {
                hours = 0;
            }
        }
    }

    secondsEl.textContent = (seconds < 10 ? "0" : "") + seconds;
    minutesEl.textContent = (minutes < 10 ? "0" : "") + minutes;
    hoursEl.textContent = (hours < 10 ? "0" : "") + hours;
}

startBtn.onclick = () => {
    if (!timerId) { // Prevent multiple intervals
        timerId = setInterval(startTimer, 1000);
    }
};

stopBtn.onclick = () => {
    if (timerId) {
        clearInterval(timerId);
        timerId = null;
    }
};

resetBtn.onclick = () => {
    if (timerId) {
        clearInterval(timerId);
        timerId = null;
    }
    hoursEl.textContent = "00";
    minutesEl.textContent = "00";
    secondsEl.textContent = "00";
};
