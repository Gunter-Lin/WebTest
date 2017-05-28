package com.gunter.client;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Gunter on 2016/5/28.
 */

public class Tasks implements Serializable {

    private List<TaskBean> tasks;

    public List<TaskBean> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskBean> tasks) {
        this.tasks = tasks;
    }

    public static class TaskBean {
        /**
         * description : Milk, Cheese, Pizza, Fruit, Tylenol
         * done : false
         * id : 1
         * title : Buy groceries
         */

        private String description;
        private boolean done;
        private int id;
        private String title;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public boolean isDone() {
            return done;
        }

        public void setDone(boolean done) {
            this.done = done;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    public String string() {
        StringBuilder sb = new StringBuilder();
        if (tasks != null && tasks.size() != 0) {
            int size = tasks.size();
            sb.append("result-size:").append(size).append("\r\n");
            sb.append("-------------------------------------------------------\r\n");
            for (TaskBean bean : tasks) {
                sb.append("id:").append(bean.getId()).append("; description:").append(bean.getDescription()).append("; done:").append(bean.isDone()).append("; title:").append(bean.getTitle()).append("\r\n");
            }
            sb.append("-------------------------------------------------------\n");
            return sb.toString();
        } else return "";
    }
}
