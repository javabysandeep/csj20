package oops.classComponents;

public class Episode {
    int episodeId;
    String episodeTitle;
    static String channelName = "Star";

    public Episode(int episodeId, String episodeTitle) {
        System.out.println("Param con");
        this.episodeId = episodeId;
        this.episodeTitle = episodeTitle;
    }

    public Episode() {
        System.out.println("Zero param con");
    }

    {
        System.out.println("Instance block");
    }

    static {
        System.out.println("Static block");
    }

    static class Feature {
        int featureId;
        String featureTitle;

        public Feature() {
            System.out.println("zero param con inner class");
        }

        public Feature(int featureId, String featureTitle) {
            this.featureId = featureId;
            this.featureTitle = featureTitle;
        }

        void setFeatureTitle(String featureTitle) {
            this.featureTitle = featureTitle;
        }
    }
}
