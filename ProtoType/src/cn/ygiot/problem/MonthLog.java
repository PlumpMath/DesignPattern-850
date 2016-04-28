package cn.ygiot.problem;

/**
 * 2016/4/28 15:40
 */
public class MonthLog implements Cloneable{
        private String name;
        private String date;
        private String content;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
}
