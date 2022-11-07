package weekly.task.byKind;

import weekly.task.Task;
import weekly.task.TaskType;

import java.time.LocalDateTime;

public class MonthlyTask extends Task {

    public MonthlyTask(String title, String description, LocalDateTime time, TaskType type) {
        super(title, description, time, type, RepeatType.MONTHLY);
    }

    @Override
    protected LocalDateTime nextRepeat() {
        return this.getTime().plusMonths(1);
    }
}
