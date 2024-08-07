package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter5 {
    public static void main(String[] args) {
    	
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日");

        // Listの作成
        List<Task> tasks = new ArrayList<>();
        // 要素の追加
        tasks.add(new Task(LocalDate.parse("2021年10月21日", formatter), "牛乳を買う。"));
        tasks.add(new Task(LocalDate.parse("2021年9月15日", formatter), "○○社面談。"));
        tasks.add(new Task(LocalDate.parse("2021年12月4日", formatter), "手帳を買う。"));
        tasks.add(new Task(LocalDate.parse("2021年8月10日", formatter), "散髪に行く。"));
        tasks.add(new Task(LocalDate.parse("2021年11月9日", formatter), "スクールの課題を解く。"));
        
        // 日付順に並び替え
        Collections.sort(tasks);
        
        // 並び替えたタスクのリストを表示
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}