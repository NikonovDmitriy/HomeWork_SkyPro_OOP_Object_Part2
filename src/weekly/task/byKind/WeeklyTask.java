package weekly.task.byKind;

import weekly.task.Task;
import weekly.task.TaskType;

import java.time.LocalDateTime;

public class WeeklyTask extends Task {

    public WeeklyTask(String title, String description, LocalDateTime time, TaskType type) {
        super(title, description, time, type, RepeatType.WEEKLY);
    }

    @Override
    protected LocalDateTime nextRepeat() {
        return this.getTime().plusWeeks(1);
    }
}
