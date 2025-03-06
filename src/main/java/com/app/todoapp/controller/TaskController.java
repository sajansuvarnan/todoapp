package com.app.todoapp.controller;

import com.app.todoapp.models.Task;
import com.app.todoapp.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @GetMapping
    public String getTasks(Model model) {
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }

    @PostMapping
    public String createTasks(@RequestParam String title) {
        taskService.createTask(title);
        return "redirect:/"; //it will open the updated link
    }


    @GetMapping("/{id}/delete")
    public String getTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/toggle")
    public String togglechaTask(@PathVariable Long id) {
        taskService.toggleTask(id);
        return "redirect:/";
    }


}
