import scala.io.StdIn

import scala.io.StdIn

def getStudentInfo(): (String, Int, Int, Double, Char) = {
  val name = StdIn.readLine("Enter the student's name: ").trim
  val marks = StdIn.readLine("Enter the student's marks: ").trim.toInt
  val totalMarks = StdIn.readLine("Enter the total possible marks: ").trim.toInt

  val percentage = (marks.toDouble / totalMarks) * 100
  val grade = percentage match {
    case p if p >= 90 => 'A'
    case p if p >= 75 => 'B'
    case p if p >= 50 => 'C'
    case _ => 'D'
  }

  (name, marks, totalMarks, percentage, grade)
}

def printStudentRecord(studentRecord: (String, Int, Int, Double, Char)): Unit = {
  val (name, marks, totalMarks, percentage, grade) = studentRecord
  println(s"Name: $name")
  println(s"Marks: $marks")
  println(s"Total Marks: $totalMarks")
  println(f"Percentage: $percentage%.2f%%")
  println(s"Grade: $grade")
}

def validateInput(name: String, marks: String, totalMarks: String): (Boolean, Option[String]) = {
  if (name.trim.isEmpty) {
    (false, Some("Name cannot be empty."))
  } else if (!marks.forall(_.isDigit) || marks.toInt < 0) {
    (false, Some("Marks must be a positive integer."))
  } else if (!totalMarks.forall(_.isDigit) || totalMarks.toInt <= 0 || marks.toInt > totalMarks.toInt) {
    (false, Some("Total possible marks must be a positive integer greater than marks."))
  } else {
    (true, None)
  }
}

def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
  var isValid = false
  var name, marks, totalMarks = ""
  var error: Option[String] = None

  while (!isValid) {
    if (error.isDefined) println(error.get)
    print("Enter the student's name: ")
    name = StdIn.readLine().trim
    print("Enter the student's marks: ")
    marks = StdIn.readLine().trim
    print("Enter the total possible marks: ")
    totalMarks = StdIn.readLine().trim

    val validationResult = validateInput(name, marks, totalMarks)
    isValid = validationResult._1
    error = validationResult._2
  }

  val percentage = (marks.toDouble / totalMarks.toDouble) * 100
  val grade = percentage match {
    case p if p >= 90 => 'A'
    case p if p >= 75 => 'B'
    case p if p >= 50 => 'C'
    case _ => 'D'
  }

  (name, marks.toInt, totalMarks.toInt, percentage, grade)
}

object StudentRecordsApp extends App {
  val studentInfo = getStudentInfoWithRetry()
  printStudentRecord(studentInfo)
}


