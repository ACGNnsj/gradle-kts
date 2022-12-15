package com.demo;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CmdTest {
    @Test
    void a() throws IOException, InterruptedException {
        Process process = Runtime.getRuntime().exec("pwsh \"G:\\bossweb\\gradle-kts\\src\\test\\resources\\test.ps1\"");
//        Process process = Runtime.getRuntime().exec("pwsh -NoExit -File \"kotlinc -script G:\\bossweb\\gradle-kts\\src\\test\\resources\\KtsTest.main.kts\"");
//        Process process =  Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"kotlinc -script G:\\bossweb\\gradle-kts\\src\\test\\resources\\KtsTest.main.kts\"");
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        System.out.println("output");
        int i = 0;
        while ((line = reader.readLine()) != null) {
            i++;
            System.out.println("line " + i + " : " + line);
        }
        // Wait for the command to finish
        process.waitFor();
    }
}
