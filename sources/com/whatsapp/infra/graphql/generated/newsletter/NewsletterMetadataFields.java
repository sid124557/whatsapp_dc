package com.whatsapp.infra.graphql.generated.newsletter;

import X.C129586aY;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterReactionCodesSettingValue;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2PictureType;

public interface NewsletterMetadataFields {

    public interface State {
        GraphQLXWA2NewsletterStateType BDy();
    }

    public interface ViewerMetadata {
        GraphQLXWA2NewsletterMuteSetting B9s();

        GraphQLXWA2NewsletterRole BCK();
    }

    public interface ThreadMetadata {

        public interface Description {
            String BDZ();

            String getId();
        }

        public interface Name {
            String BDZ();

            String getId();
        }

        public interface Picture {
            String B75();

            GraphQLXWA2PictureType BDz();

            String BE7();

            String getId();
        }

        public interface Preview {
            String B75();

            GraphQLXWA2PictureType BDz();

            String BE7();

            String getId();
        }

        public interface Settings {

            public interface ReactionCodes {
                C129586aY B4i();

                String B7J();

                GraphQLXWA2NewsletterReactionCodesSettingValue BE9();
            }

            ReactionCodes BBs();
        }

        String B6D();

        Description B6w();

        String B7z();

        String B8T();

        Name B9u();

        Picture BBK();

        Preview BBd();

        Settings BCu();

        String BDN();

        GraphQLXWA2NewsletterVerifyState BEE();
    }

    State BDI();

    ThreadMetadata BDd();

    ViewerMetadata BEO();
}
