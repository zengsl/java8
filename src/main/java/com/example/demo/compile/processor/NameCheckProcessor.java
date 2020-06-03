package com.example.demo.compile.processor;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.util.Set;

/**
 * src\main\java下执行
 * javac -encoding UTF-8 com/example/demo/compile/processor/NameChecker.java
 * javac -encoding UTF-8 com/example/demo/compile/processor/NameCheckProcessor.java
 * javac -processor com.example.demo.compile.processor.NameCheckProcessor com/example/demo/compile/processor/BADLY_NAMED_CODE.java
 *
 * @author Zengsl
 * @version V1.0
 * @date 2020-6-3 21:08
 */
@SupportedAnnotationTypes("*")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class NameCheckProcessor extends AbstractProcessor {

    private NameChecker nameChecker;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        nameChecker = new NameChecker(processingEnv);
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        if (!roundEnv.processingOver()) {
            for (Element element : roundEnv.getRootElements()) {
                nameChecker.checkNames(element);
            }
        }

        return false;
    }
}
