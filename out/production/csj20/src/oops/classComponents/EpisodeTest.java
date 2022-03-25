package oops.classComponents;

public class EpisodeTest {
    public static void main(String[] args) {
        Episode episode = new Episode();
       /* Episode.Feature feature = episode.new Feature();
        feature.setFeatureTitle("trailer");
        System.out.println(feature.featureTitle);*/

        Episode.Feature feature = new Episode.Feature();

         class Feature {
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
}
