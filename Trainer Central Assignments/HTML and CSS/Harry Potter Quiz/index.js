// load page

setTimeout(()=>{
  document.getElementById("startPage").style.display = 'none';
  document.getElementById("main-bg").style.display = "flex";
},1000);


//retrieve resultsList from local storage : 
let resultsList = JSON.parse(localStorage.getItem('resultsList')) || [];
console.log(resultsList);

//Api s :

const easyQuestions = [
    {
      "question": "How does Harry manage to breathe underwater during the second task of the Triwizard Tournament?",
      "options": [
        "He transfigures into a shark",
        "He kisses a mermaid",
        "He performs a bubble-head charm",
        "He eats gillyweed"
      ],
      "answer": "He eats gillyweed",
      "img": "question1",
      "point": 5
    },
    {
      "question": "What is the name of Fred and George’s joke shop?",
      "options": [
        "Weasley Joke Emporium",
        "Fred & George’s Wonder Emporium",
        "Zonko’s Joke Shop",
        "Weasleys’ Wizard Wheezes"
      ],
      "answer": "Weasleys’ Wizard Wheezes",
      "img": "question2",
      "point": 5
    },
    {
      "question": "Which of these is NOT one of the Unforgivable Curses",
      "options": ["Cruciatus", "Imperius", "Avada Kedavra", "Sectumsempra"],
      "answer": "Sectumsempra",
      "img": "question3",
      "point": 5
    },
    {
      "question": "Who played Lord Voldemort in the movies?",
      "options": ["Gary Oldman", "Tom Hiddleston", "Jeremy Irons", "Ralph Fiennes"],
      "answer": "Ralph Fiennes",
      "img": "question4",
      "point": 5
    },
    {
      "question": "Who guards the entrance to the Gryffindor common room?",
      "options": [
        "The Grey Lady",
        "The Fat Friar",
        "The Bloody Baron",
        "The Fat Lady"
      ],
      "answer": "The Fat Lady",
      "img": "question5",
      "point": 5
    },
    {
      "question": "Who is NOT a member of the Order of the Phoenix?",
      "options": [
        "Mad-eye Moody",
        "Professor Snape",
        "Remus Lupin",
        "Cornelius Fudge"
      ],
      "answer": "Cornelius Fudge",
      "img": "question6",
      "point": 5
    },
    {
      "question": "A wizard who cannot do magic is known as a:",
      "options": ["Bleaker", "Duddle", "Wizont", "Squib"],
      "answer": "Squib",
      "img": "question7",
      "point": 5
    },
    {
      "question": "What does the spell “Obliviate” do?",
      "options": [
        "Destroys objects",
        "Sends someone to the nether realm",
        "Makes objects invisible",
        "Removes parts of someone’s memory"
      ],
      "answer": "Removes parts of someone’s memory",
      "img": "question8",
      "point": 5
    },
    {
      "question": "Where does Hermione brew her first batch of Polyjuice Potion?",
      "options": [
        "The Hogwarts Kitchen",
        "The Room of Requirement",
        "The Gryffindor Common Room",
        "Moaning Myrtle’s Bathroom"
      ],
      "answer": "Moaning Myrtle’s Bathroom",
      "img": "question9",
      "point": 5
    },
    {
      "question": "What does one say to close the Marauder’s Map and make it blank again?",
      "options": [
        "Nothing to See Here",
        "All Done",
        "Hello Professor",
        "Mischief Managed"
      ],
      "answer": "Mischief Managed",
      "img": "question10",
      "point": 5
    },
    {
      "question": "The three kinds of balls used in Quidditch are Bludgers, Snitches, and…",
      "options": ["Wiffles", "Boccis", "Foozles", "Quaffles"],
      "answer": "Quaffles",
      "img": "question11",
      "point": 5
    },
    {
      "question": "Who has been stealing Harry’s letters from Ron and Hermione at the beginning of ‘Harry Potter and the Chamber of Secrets’?",
      "options": ["Dumbledore", "Draco Malfoy", "The Dursleys", "Dobby"],
      "answer": "Dobby",
      "img": "question12",
      "point": 5
    },
    {
      "question": "How many Weasley siblings are there?",
      "options": ["5", "10", "3", "7"],
      "answer": "7",
      "img": "question13",
      "point": 5
    },
    {
      "question": "Where do Harry and Ron eventually find the missing flying Ford Anglia?",
      "options": [
        "At the Ministry of Magic",
        "In the Room of Requirement",
        "Outside the Dursleys House",
        "In the Forbidden Forest"
      ],
      "answer": "In the Forbidden Forest",
      "img": "question14",
      "point": 5
    },
    {
      "question": "From what King’s Cross platform does the Hogwarts Express leave?",
      "options": [
        "Eight and One-quarter",
        "Nine and Three-quarters",
        "Five and a Half",
        "Elevenquet"
      ],
      "answer": "Elevenquet",
      "img": "question15",
      "point": 5
    },
    {
      "question": "What’s the name of Filch’s cat?",
      "options": ["Ser Pounce", "Buttercup", "Jones", "Mrs. Norris"],
      "answer": "Mrs. Norris",
      "img": "question16",
      "point": 5
    },
    {
      "question": "Which professor teaches flying lessons?",
      "options": [
        "Professor Grubbly-Plank",
        "Sybill Trelawney",
        "Charity Burbage",
        "Madam Hooch"
      ],
      "answer": "Madam Hooch",
      "img": "question17",
      "point": 5
    },
    {
      "question": "Which is NOT a form of currency in the wizarding world?",
      "options": ["Sickles", "Knuts", "Galleons", "Doxies"],
      "answer": "Doxies",
      "img": "question18",
      "point": 5
    },
    {
      "question": "What does Hermione use to defeat the Devil’s Snare plant?",
      "options": ["Expelliarmus!", "Wind", "Reducto", "Lumos Solem"],
      "answer": "Lumos Solem",
      "img": "question19",
      "point": 5
    },
    {
      "question": "Who has given Harry Potter the Invisibility cloak?",
      "options": ["Mad-eye Moody", "Professor Snape", "Dobby", "Dumbledore"],
      "answer": "Dumbledore",
      "img": "question20",
      "point": 5
    },
    {
      "question": "What is the model of the first broom Harry ever receives?",
      "options": ["Cleansweep One", "Hoover", "Firebolt", "Nimbus 2000"],
      "answer": "Nimbus 2000",
      "img": "question21",
      "point": 5
    },
    {
      "question": "What does Mrs. Weasley give Harry for Christmas every year?",
      "options": [
        "Bertie Bott’s every flavour beans",
        "Chocolate frogs",
        "A fruit cake",
        "A new sweater"
      ],
      "answer": "A new sweater",
      "img": "question22",
      "point": 5
    },
    {
      "question": "What are the names of Draco Malfoy’s two cronies?",
      "options": [
        "Huggs and Pucey",
        "Flint and Boyle",
        "Pike and Zabini",
        "Crabbe and Goyle"
      ],
      "answer": "Crabbe and Goyle",
      "img": "question23",
      "point": 5
    },
    {
      "question": "Where does Dumbledore’s Army meet in ‘Harry Potter and the Order of the Phoenix’?",
      "options": [
        "The Gryffindor Common Room",
        "Hagrid’s House",
        "The Shrieking Shack",
        "The Room of Requirement"
      ],
      "answer": "The Room of Requirement",
      "img": "question24",
      "point": 5
    },
    {
      "question": "How do you summon a Patronus?",
      "options": [
        "Patronia Paternus",
        "Expelliarmus Patronicha",
        "Accio Patronus",
        "Expecto Patronum"
      ],
      "answer": "Expecto Patronum",
      "img": "question25",
      "point": 5
    }
];

  
const mediumQuestions = [
    {
      "question": "What's the name of the dog guarding the Sorcerer’s Stone?",
      "options": ["Padfoot", "Fang", "The Grim", "Fluffy"],
      "answer": "Fluffy",
      "img": "question26",
      "point": 10
    },
    {
      "question": "In a Quidditch game, what type of ball is a Beater most likely to hit?",
      "options": ["Nimbus", "Quaffle", "Snitch", "Bludger"],
      "answer": "Bludger",
      "img": "question",
      "point": 10
    },
    {
      "question": "What spell does Ron use against the troll in Harry Potter and the Sorcerer's Stone?",
      "options": ["Alohomora", "Expelliarmus", "Wingardium Leviosa", "Stupefy"],
      "answer": "Stupefy",
      "img": "question27",
      "point": 10
    },
    {
      "question": "What kind of monster is released from the Chamber of Secrets?",
      "options": ["Voldemort", "Acromantula", "Boggart", "Basilisk"],
      "answer": "Basilisk",
      "img": "question28",
      "point": 10
    },
    {
      "question": "Who is the Heir of Slytherin?",
      "options": ["Rubeus Hagrid", "Harry Potter", "Draco Malfoy", "Tom Riddle"],
      "answer": "Tom Riddle",
      "img": "question29",
      "point": 10
    },
    {
      "question": "Sirius Black escapes on what kind of fantastic beast in the Prisoner of Azkaban?",
      "options": ["Phoenix", "Dragon", "Unicorn", "Hippogriff"],
      "answer": "Hippogriff",
      "img": "question30",
      "point": 10
    },
    {
      "question": "Who was Harry's love interest before Ginny Weasley?",
      "options": [
        "Fleur Delacour",
        "Luna Lovegood",
        "Hermione Granger",
        "Cho Chang"
      ],
      "answer": "Cho Chang",
      "img": "question31",
      "point": 10
    },
    {
      "question": "Which of these award-winning and celebrated British actors has NOT appeared in a Harry Potter movie?",
      "options": ["Emma Thompson", "Alan Rickman", "Maggie Smith", "Judi Dench"],
      "answer": "Judi Dench",
      "img": "question32",
      "point": 10
    },
    {
      "question": "Which Hogwarts teacher had to be re-cast after the actor playing this character died?",
      "options": ["Hagrid", "Grubblyplank", "Flitwick", "Dumbledore"],
      "answer": "Dumbledore",
      "img": "question33",
      "point": 10
    },
    {
      "question": "Which character was NOT an Animagus?",
      "options": [
        "James Potter",
        "Peter Pettigrew",
        "Professor McGonagall",
        "Remus Lupin"
      ],
      "answer": "Remus Lupin",
      "img": "question34",
      "point": 10
    },
    {
      "question": "Which composer was nominated for both Academy and Grammy awards for the music in the Harry Potter films?",
      "options": [
        "Danny Elfman",
        "Michael Giacchino",
        "Andrew Lloyd Webber",
        "John Williams"
      ],
      "answer": "John Williams",
      "img": "question35",
      "point": 10
    },
    {
      "question": "You can only see a Thestral if you…",
      "options": [
        "Believe in the Deathly Hallows",
        "Bow to them",
        "Have seen death",
        "Wear special goggles"
      ],
      "answer": "Wear special goggles",
      "img": "question36",
      "point": 10
    },
    {
      "question": "Who is the ghost of Gryffindor Tower?",
      "options": ["Grey Lady", "Bloody Baron", "Fat Friar", "Sir Nicholas"],
      "answer": "Sir Nicholas",
      "img": "question37",
      "point": 10
    },
    {
      "question": "What potion does Harry use to get Professor Slughorn to tell his secret?",
      "options": ["Polyjuice", "Veritas Serum", "Amortentia", "Felix Felicis"],
      "answer": "Felix Felicis",
      "img": "question38",
      "point": 10
    },
    {
      "question": "Which Weasley brother marries former Beauxbatons student Fleur Delacour?",
      "options": ["Fred", "Percy", "Charlie", "Bill"],
      "answer": "Bill",
      "img": "question39",
      "point": 10
    },
    {
      "question": "What's the last Horcrux that has to be destroyed in order for Voldemort to die?",
      "options": ["Ravenclaw's Diadem", "Hufflepuff's Cup", "Harry", "Nagini"],
      "answer": "Nagini",
      "img": "question40",
      "point": 10
    },
    {
      "question": "The Sorting Hat considers which two houses for Harry before ultimately choosing Gryffindor?",
      "options": [
        "Gryffindor and Hufflepuff",
        "Gryffindor and Ravenclaw",
        "Ravenclaw and Hufflepuff",
        "Gryffindor and Slytherin"
      ],
      "answer": "Gryffindor and Slytherin",
      "img": "question41",
      "point": 10
    },
    {
      "question": "Who teaches Harry how to cast a Patronus Charm?",
      "options": [
        "Hermione Granger",
        "Albus Dumbledore",
        "Severus Snape",
        "Remus Lupin"
      ],
      "answer": "Remus Lupin",
      "img": "question42",
      "point": 10
    },
    {
      "question": "Which other character could fulfill the prophecy described in Harry Potter and the Order of the Phoenix?",
      "options": [
        "Ron Weasley",
        "Luna Lovegood",
        "Cho Chang",
        "Neville Longbottom"
      ],
      "answer": "Neville Longbottom",
      "img": "question43",
      "point": 10
    },
    {
      "question": "Who is the Half-Blood Prince featured in the title of the sixth book?",
      "options": [
        "Lord Voldemort",
        "Draco Malfoy",
        "Rubeus Hagrid",
        "Severus Snape"
      ],
      "answer": "Severus Snape",
      "img": "question44",
      "point": 10
    },
    {
      "question": "How many pieces does Voldemort divide his soul into, including himself?",
      "options": ["Seven", "Ten", "Three", "Eight"],
      "answer": "Eight",
      "img": "question45",
      "point": 10
    },
    {
      "question": "Which spell is used to summon items, even from across the room?",
      "options": ["Reparo", "Legilimens", "Alohomora", "Accio"],
      "answer": "Accio",
      "img": "question46",
      "point": 10
    },
    {
      "question": "What is Dumbledore's pet phoenix named:",
      "options": ["Fortescue", "Fenix", "Fauntleroy", "Fawkes"],
      "answer": "Fawkes",
      "img": "question47",
      "point": 10
    },
    {
      "question": "Which of these characters has never been a Death Eater?",
      "options": [
        "Peter Pettigrew",
        "Severus Snape",
        "Lucius Malfoy",
        "Horace Slughorn"
      ],
      "answer": "Horace Slughorn",
      "img": "question48",
      "point": 10
    },
    {
      "question": "Which character is killed by the basilisk in Harry Potter and the Chamber of Secrets?",
      "options": [
        "Ginny Weasley",
        "Nearly Headless Nick",
        "Colin Creevey",
        "Moaning Myrtle"
      ],
      "answer": "Moaning Myrtle",
      "img": "question49",
      "point": 10
    },
    {
      "question": "Who is named Minister of Magic after the Battle of Hogwarts in Harry Potter and the Deathly Hallows?",
      "options": [
        "Cornelius Fudge",
        "Rufus Scrimgeour",
        "Arthur Weasley",
        "Kingsley Shaklebolt"
      ],
      "answer": "Kingsley Shaklebolt",
      "img": "question50",
      "point": 10
    }
];
  

const hardQuestions = [
    {
        "question": "What is the name of the vault in Gringotts that contains the Horcrux Harry and his friends break into?",
        "options": ["Vault 687", "Vault 394", "Vault 713", "Vault 720"],
        "answer": "Vault 713",
        "point": 15
    },
    {
        "question": "Which member of the Order of the Phoenix was a werewolf before becoming a member?",
        "options": ["Remus Lupin", "Sirius Black", "Albus Dumbledore", "Filius Flitwick"],
        "answer": "Remus Lupin",
        "point": 15
    },
    {
        "question": "What was the original name of the Marauder's Map before it was enchanted by the Marauders?",
        "options": ["The Map of the Hogwarts Grounds", "The Hogwarts Blueprint", "The Marauder’s Blueprint", "The Secret Map"],
        "answer": "The Marauder’s Blueprint",
        "point": 15
    },
    {
        "question": "Which of the following is NOT one of the original four founders of Hogwarts?",
        "options": ["Godric Gryffindor", "Helga Hufflepuff", "Rowena Ravenclaw", "Salazar Slytherin"],
        "answer": "Rowena Ravenclaw",
        "point": 15
    },
    {
        "question": "In which book does Albus Dumbledore first mention the concept of Horcruxes?",
        "options": ["Harry Potter and the Sorcerer's Stone", "Harry Potter and the Chamber of Secrets", "Harry Potter and the Half-Blood Prince", "Harry Potter and the Deathly Hallows"],
        "answer": "Harry Potter and the Half-Blood Prince",
        "point": 15
    },
    {
        "question": "Which magical creature is known for being able to change its appearance at will?",
        "options": ["Basilisk", "Chimaera", "Niffler", "Poltergeist"],
        "answer": "Chimaera",
        "point": 15
    },
    {
        "question": "What is the full name of the character known as 'Mad-Eye' Moody?",
        "options": ["Alastor Moody", "Albus Moody", "Aloysius Moody", "Augustus Moody"],
        "answer": "Alastor Moody",
        "point": 15
    },
    {
        "question": "Which of the following items is NOT one of the Deathly Hallows?",
        "options": ["The Invisibility Cloak", "The Resurrection Stone", "The Elder Wand", "The Time-Turner"],
        "answer": "The Time-Turner",
        "point": 15
    },
    {
        "question": "What magical object allows a wizard to travel back in time for short periods?",
        "options": ["The Time-Turner", "The Portkey", "The Mirror of Erised", "The Pensieve"],
        "answer": "The Time-Turner",
        "point": 15
    },
    {
        "question": "Which character reveals that Voldemort has split his soul into seven parts?",
        "options": ["Horace Slughorn", "Albus Dumbledore", "Sirius Black", "Rubeus Hagrid"],
        "answer": "Horace Slughorn",
        "point": 15
    }
];




// bg - audio controls
const audioElement = document.getElementById('background-audio');
const audioIcon = document.getElementById('audio-icon');
const icon = document.getElementById('play-icon');

const toggleAudio = () => {
    if (audioElement.paused) {
        audioElement.play(); // Play audio if it is paused
        icon.classList.remove('fa-play');
        icon.classList.add('fa-pause');
    } else {
        audioElement.pause(); // Pause audio if it is playing
        icon.classList.remove('fa-pause');
        icon.classList.add('fa-play');
    }
}
// toggleAudio();
audioIcon.addEventListener('click', toggleAudio);

let imgSrcs = ["./assets/main-bg/leaderboard-first.png", "./assets/main-bg/leaderboard-second.png", "./assets/main-bg/leaderboard-third.png"];

//function to load leader board :
function loadLeaderBoard() {
  const leaderboardList = document.getElementById('leader-board-list');
  leaderboardList.innerHTML = ''; 

  resultsList.forEach((result, index) => {
    const rank = index + 1;
  
    const entryDiv = document.createElement('div');
    entryDiv.classList.add("rank-container");
    
    const imgEl = document.createElement('img');
    imgEl.classList.add("rank-img");
    imgEl.src = rank <= 3 ? imgSrcs[index] : "./assets/main-bg/leader-board-rest.png";
    imgEl.setAttribute('alt', `Rank ${rank}`);
    
    
    // Create the span for rank
    const rankEl = document.createElement('span');
    rankEl.className = 'rank';
    rankEl.textContent = rank;
    
    // Create the span for name
    const nameEl = document.createElement('span');
    nameEl.className = 'name';
    nameEl.textContent = result.name;
    
    // Create the span for score
    const scoreEl = document.createElement('span');
    scoreEl.className = 'score';
    scoreEl.textContent = result.points < 10 ? '0' + result.points : result.points;
    
    // Create the span for time left
    const timeLeftEl = document.createElement('span');
    timeLeftEl.className = 'timeLeft';
    timeLeftEl.textContent = result.timeLeft;
    
    // Append all elements to the entryDiv
    entryDiv.appendChild(imgEl);
    entryDiv.appendChild(rankEl);
    entryDiv.appendChild(nameEl);
    entryDiv.appendChild(scoreEl);
    entryDiv.appendChild(timeLeftEl);
    
    // Append the entryDiv to the leaderboard list
    leaderboardList.appendChild(entryDiv);
  });
}



// Change the page from home page to leaderboards and quiz page

const quizLevelPage = document.getElementById('quizLevelPage');
const homePage = document.getElementById('homePage');
const leaderboardPage = document.getElementById('leaderboardPage');
const backIcon = document.getElementById('backIcon');
const backIcon2 = document.getElementById('backIcon2');

const startQuizBtn = document.getElementById('startQuiz');
const leaderboardBtn = document.getElementById('leaderboard');

startQuizBtn.onclick = ()=>{
    homePage.style.display = 'none';
    quizLevelPage.style.display = 'block';
}

leaderboardBtn.onclick = ()=>{
    document.getElementById("mainContent").style.display ="none";
    leaderboardPage.style.display ='block';
    loadLeaderBoard();
}

const levelToHome = () => {
  homePage.style.display = 'block';
  quizLevelPage.style.display = 'none';
}

const leaderToHome = ()=>{
  document.getElementById("mainContent").style.display = 'flex';
    leaderboardPage.style.display = 'none';
}

backIcon.addEventListener('click', levelToHome);
backIcon2.addEventListener('click', leaderToHome);

document.getElementById('resultsToHome').onclick = () =>{
  location.reload();
}

//function to load question:let currentQuestionIndex = 0;
let score = 0;
let selectedOptionIndex = -1;

let difficulty;
let countdown;
let timerElement;

// Function to load a question
function loadQuestion(index) {
    const questionData = difficulty[index];
    document.getElementById('questionEl').textContent = questionData.question;
    document.getElementById('option1').textContent = questionData.options[0];
    document.getElementById('option2').textContent = questionData.options[1];
    document.getElementById('option3').textContent = questionData.options[2];
    document.getElementById('option4').textContent = questionData.options[3];

    let imagenum = Math.floor(Math.random() * 49) + 2;
    let imagePath = `assets/questions/question${imagenum}.jpg`;

    document.getElementById("body").style.backgroundImage = `url(${imagePath})`;

    document.querySelectorAll('.options').forEach(option => {
        option.classList.remove('selected');
    });

    selectedOptionIndex = -1; // Reset selected option
}

// Function to handle option selection
function selectOption(index) {
    if (selectedOptionIndex === -1) { // If no option has been selected yet
        selectedOptionIndex = index;
        document.querySelectorAll('.options')[index].classList.add('selected');

        if (difficulty[currentQuestionIndex].options[index] === difficulty[currentQuestionIndex].answer) {
            score += difficulty[currentQuestionIndex].point;
        }
    }
}

// Function to load the next question or finish the quiz
function loadNextQuestion() {
    if (currentQuestionIndex < difficulty.length - 1) {
        currentQuestionIndex++;

        loadQuestion(currentQuestionIndex);
        
    } else {
        finishQuiz();
    }
}

// Function to finish the quiz
function finishQuiz() {
  document.getElementById('well-done').style.display = 'block';
  document.getElementById('quiz-content').style.display = 'none';
  document.getElementById("main-bg").style.backgroundImage = `url('assets/questions/question4.jpg')`;
  document.getElementById("body").style.backgroundImage = "url('./assets/main-bg/large-bg.jpg')";
  
  setTimeout(()=>{  clearInterval(countdown); // Stop the timer
    document.getElementById('well-done').style.display = 'none';
    document.getElementById('results').style.display = 'block';
    const timeLeft = document.getElementById('timer').textContent;
    document.getElementById('finalScore').textContent = `Time Left: ${timeLeft}\n Points: ${score}`;
    document.getElementById("nameInput").style.display = 'block';
    document.getElementById("saveBtn").style.display = 'block';},2000);
    
}

// Function to load the quiz with the selected difficulty
function loadQuiz(choice) {
  
    difficulty = choice;
    currentQuestionIndex = 0;
    score = 0;
    loadQuestion(currentQuestionIndex);

    timerElement = document.getElementById('timer');
    let time = difficulty===hardQuestions? 60: 120; // 2 minutes in seconds

    countdown = setInterval(() => {
        const minutes = Math.floor(time / 60);
        const seconds = time % 60;

        // Format the time as MM:SS
        timerElement.textContent = 
            `${minutes.toString().padStart(2, '0')}:${seconds.toString().padStart(2, '0')}`;

        if (time > 0) {
            time--;
        } else {
            clearInterval(countdown);
            finishQuiz();
        }
    }, 1000);
}

// Function to transition from level selection to quiz page
function optionToQuizPage() {
    document.getElementById("quizLevelPage").style.display = "none";
    document.getElementById("quizPage").style.display = "block";
}

// Functions to load questions based on the chosen difficulty
function loadEasyQuestions() {
    optionToQuizPage();
    loadQuiz(easyQuestions);
}

function loadMediumQuestions() {
    optionToQuizPage();
    loadQuiz(mediumQuestions);
}

function loadHardQuestions() {
    optionToQuizPage();
    loadQuiz(hardQuestions);
}

// Example: Call one of these functions based on user selection
// loadEasyQuestions();
// loadMediumQuestions();
// loadHardQuestions();

    
function saveResult() {
  const name = document.getElementById('nameInput').value;
  const timeLeft = timerElement.textContent;


  function saveToLocalStorage(){
    // Sort based on points (descending) and timeLeft (ascending)
    resultsList.sort((a, b) => {
      if (b.points !== a.points) {
          return b.points - a.points; // Sort by points, descending
      } else {
          return a.timeLeft.localeCompare(b.timeLeft); // Sort by timeLeft, ascending
      }
    });

    // Keep only top 10 results
    if(resultsList.length>10){
      resultsList = resultsList.slice(0, 10);
    } 

    localStorage.setItem('resultsList', JSON.stringify(resultsList));
  }

  if (name) {
      const result = {
          name: name,
          timeLeft: timeLeft,
          points: score
      };

      resultsList.push(result);
      console.log(resultsList); // For testing, to see the results list in the console

      // Clear input after saving
      document.getElementById('nameInput').value = '';

      document.getElementById("nameInput").style.display = 'none';
      document.getElementById("saveBtn").style.display = 'none';
      saveToLocalStorage();
      alert('Result saved!');
  } else {
      alert('Please enter your name.');
  }
}


