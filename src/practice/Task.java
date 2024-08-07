package practice;

import java.time.LocalDate;

public class Task implements Comparable<Task> {
    private LocalDate date;
    private String content;

    public Task(LocalDate date, String content) {
        this.date = date;
        this.content = content;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }
    
    @Override
    public int compareTo(Task other) {
        return this.date.compareTo(other.date);
    }

    @Override
    public String toString() {
        return date + " : " + content;
    }
}