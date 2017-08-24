package com.kawo.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

public class KawoPlugin implements Plugin<Project> {

    void apply(Project project) {
        System.out.println("========================");
        System.out.println("hello gradle plugin!");
        System.out.println("========================");
    }
}