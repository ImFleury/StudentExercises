const PROBLEMS_PER_SET = 10;
let problemSet = [];
let currentProblem = 1;
let score = 0;

/*
 * Generates a problem set with {PROBLEMS_PER_SET} problems
 *
 */
function generateProblemSet() {
  for(i = 0; i < PROBLEMS_PER_SET; ++i) {
    const problem = {
      left: getRandomNumber(10),
      right: getRandomNumber(10),
      answer: null
    }
    const correctAnswer = problem.left * problem.right;
    problem.answer = correctAnswer;
    const answers = shuffleArray([correctAnswer,getRandomNumber(82),getRandomNumber(82),getRandomNumber(82)]);
    problemSet.push({ problem, answers });
  }
}


/**
 * Handles display the current problem set
 * The expression & answers are both empty by default
 */
function displayProblemSet() {
  displayProblem();
  displayAnswers();
}

function displayProblem() {}

function displayAnswers(){}