package com.example.taskOfRest.string_operation;

import java.util.function.BooleanSupplier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringServiceTest {
    @Test
    public void reverseWordTest() throws Exception {
        StringService stringService = new StringService();

        String reverseWordAdana = stringService.reverseWord("adana");
        assertTrue(reverseWordAdana.equals("anada"));

        String reverseWordLondon = stringService.reverseWord("Lon don");
        assertFalse(reverseWordLondon.equals("nodnoL"));

        String reverseWordScreenCapital = stringService.reverseWord("SECREN");
        assertTrue(reverseWordScreenCapital.equals("NERCES"));

        String reverseWordScreenCapitalCase = stringService.reverseWord("SECREN");
        assertTrue(reverseWordScreenCapitalCase.equals("NERCES"));

        String reverseWordScreenLowerCase = stringService.reverseWord("head");
        assertTrue(reverseWordScreenLowerCase.equals("daeh"));

        String reverseWordSpace = stringService.reverseWord("A L I C A N");
        assertTrue(reverseWordSpace.equals("N A C I L A"));

        String reverseWordBeginSpace = stringService.reverseWord(" ALICAN");
        assertTrue(reverseWordBeginSpace.equals("NACILA "));

        String reverseWordMiddleSpace = stringService.reverseWord("ALI CAN");
        assertTrue(reverseWordMiddleSpace.equals("NAC ILA"));

        String reverseWordEndSpace = stringService.reverseWord("ALICAN ");
        assertTrue(reverseWordEndSpace.equals(" NACILA"));

    }

    @Test
    public void isPalindromeTest() throws Exception {
        StringService stringService = new StringService();

        Boolean isPalindromeAda = stringService.isPalindrome("ada");
        assertTrue(isPalindromeAda);

        Boolean isPalindromeBibSpace = stringService.isPalindrome("b i b");
        assertTrue(isPalindromeBibSpace);

        Boolean isPalindromeAdaAdaMiddleSpace = stringService.isPalindrome("ada ada");
        assertTrue(isPalindromeAdaAdaMiddleSpace);

        Boolean isPalindromeAdaAdaBegin_And_MiddleSpace = stringService.isPalindrome(" ada ada");
        assertTrue(isPalindromeAdaAdaBegin_And_MiddleSpace);

        Boolean isPalindromeAdaAdaMiddle_And_EndSpace = stringService.isPalindrome("ada ada ");
        assertTrue(isPalindromeAdaAdaMiddle_And_EndSpace);

        Boolean isPalindromeAdaAdaAfterEachLetterSpace = stringService.isPalindrome("a d a a d a");
        assertTrue(isPalindromeAdaAdaAfterEachLetterSpace);

        Boolean isPalindromeAdaMiddle_And_EndSpace = stringService.isPalindrome("Ada ada ");
        assertTrue(isPalindromeAdaMiddle_And_EndSpace);
    }

    @Test
    public void createAnagramTest() throws Exception {
        StringService stringService = new StringService();
        ResultAnagram resultAnagram1 = new ResultAnagram("silent", "listen", "anagram");
        ResultAnagram resultAnagram2 = new ResultAnagram("adana", "ankara", "not-anagram");
        ResultAnagram resultAnagram3 = new ResultAnagram("s i l e n t", "l i s t e n", "anagram");
        ResultAnagram resultAnagram4 = new ResultAnagram("s i l _ e n t", "l i s t _ e n", "not-anagram");

        ResultAnagram createAnagramListenAndSilent = stringService.createAnagram("silent", "listen");
        assertTrue(new ResultAnagram(createAnagramListenAndSilent.getAttribute1(), createAnagramListenAndSilent.getAttribute2(),createAnagramListenAndSilent.getResult()).equals(resultAnagram1));

        ResultAnagram createAnagramAdanaAndAnkara = stringService.createAnagram("adana", "ankara");
        assertTrue(new ResultAnagram(createAnagramAdanaAndAnkara.getAttribute1(), createAnagramAdanaAndAnkara.getAttribute2(),createAnagramAdanaAndAnkara.getResult()).equals(resultAnagram2));

        ResultAnagram createAnagramSpaceListenAndSilent = stringService.createAnagram("s i l e n t", "l i s t e n");
        assertTrue(new ResultAnagram(createAnagramSpaceListenAndSilent.getAttribute1(), createAnagramSpaceListenAndSilent.getAttribute2(),createAnagramSpaceListenAndSilent.getResult()).equals(resultAnagram3));

        ResultAnagram createAnagramListenAndSilentBetweenUnderscore = stringService.createAnagram("s i l _ e n t", "l i s t _ e n");
        assertTrue(new ResultAnagram(createAnagramListenAndSilentBetweenUnderscore.getAttribute1(), createAnagramListenAndSilentBetweenUnderscore.getAttribute2(),createAnagramListenAndSilentBetweenUnderscore.getResult()).equals(resultAnagram4));
    }


}