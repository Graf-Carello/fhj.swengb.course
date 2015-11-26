package fhj.swengb.avatarix


import fhj.swengb.{Students, GitHub}
import org.junit.Assert._
import org.junit.Test

/**
  * Created by graf, hasenbichler, koerner on 14.11.15.
  */

class AvatarixTest{


  @Test def isValidUrl(): Unit = {
    assertTrue(Students.jblazevic.firstName == "Josip")
  }

  @Test def correctHtmlUrl(): Unit = {
    assertEquals(1,1)
    //assertTrue(Student existiert nur einmal)
  }

  @Test def correctLogin(): Unit = {
    //blabla
  }

  @Test def cornerCase(): Unit = {
    //Was passiert bei ungültigen Studenten
  }
}
