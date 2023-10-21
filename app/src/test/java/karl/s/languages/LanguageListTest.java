package karl.s.languages;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LanguageListTest {

    @Test
    void isEmptyTest() {
        LanguageList emptyLanguageList = new LanguageList();
        assertTrue(emptyLanguageList.isEmpty());

        LanguageList notEmptyLanguageList = new LanguageList();
        notEmptyLanguageList.addLanguage("Python");
        assertFalse(notEmptyLanguageList.isEmpty());
    }

    @Test
    void addLanguageTest() {
        LanguageList languageList = new LanguageList();
        assertTrue(languageList.isEmpty());

        languageList.addLanguage("Kotlin");
        assertFalse(languageList.isEmpty());
        assertTrue(languageList.containsLanguage("Kotlin"));
    }

    @Test
    void removeLanguageTest() {
        LanguageList languageList = new LanguageList();
        languageList.addLanguage("Scala");
        assertTrue(languageList.containsLanguage("Scala"));

        languageList.removeLanguage("Scala");
        assertFalse(languageList.containsLanguage("Scala"));
    }

    @Test
    void firstLanguageTest() {
        LanguageList languageList = new LanguageList();
        languageList.addLanguage("Scala");
        languageList.addLanguage("Kotlin");
        languageList.addLanguage("Rust");

        assertEquals("Scala", languageList.firstLanguage());
    }

    @Test
    void countTest() {
        LanguageList languageList = new LanguageList();
        assertEquals(0, languageList.count());

        languageList.addLanguage("Ruby");
        assertEquals(1, languageList.count());

        languageList.addLanguage("Bash");
        languageList.addLanguage("V");
        assertEquals(3, languageList.count());
    }

    @Test
    void containsLanguageTest() {
        LanguageList languageList = new LanguageList();
        assertFalse(languageList.containsLanguage("Python"));

        languageList.addLanguage("Ruby");
        assertTrue(languageList.containsLanguage("Ruby"));
    }

    @Test
    void isExciting() {
        LanguageList notExcitinglanguageList = new LanguageList();
        notExcitinglanguageList.addLanguage("Python");
        assertFalse(notExcitinglanguageList.isExciting());

        LanguageList kotlinLanguageList = new LanguageList();
        kotlinLanguageList.addLanguage("Kotlin");
        assertTrue(kotlinLanguageList.isExciting());

        LanguageList javaLanguageList = new LanguageList();
        javaLanguageList.addLanguage("Java");
        assertTrue(javaLanguageList.isExciting());
    }
}