package AnnotationExample;


public @interface ClassInfo {
    String a = "ghjgh";
    String author();
    String date();
    int currentVersion() default 1;
    String lastModifiedBy() default "N/A";
    String[] contributors();
}
