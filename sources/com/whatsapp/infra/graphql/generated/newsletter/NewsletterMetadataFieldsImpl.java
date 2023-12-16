package com.whatsapp.infra.graphql.generated.newsletter;

import X.C129586aY;
import X.C153197aq;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterReactionCodesSettingValue;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2PictureType;
import org.json.JSONObject;

public final class NewsletterMetadataFieldsImpl extends C153197aq implements NewsletterMetadataFields {

    public final class ThreadMetadata extends C153197aq implements NewsletterMetadataFields.ThreadMetadata {

        public final class Description extends C153197aq implements NewsletterMetadataFields.ThreadMetadata.Description {
            public String BDZ() {
                return A04("text");
            }

            public String getId() {
                return this.A00.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            }

            public Description(JSONObject jSONObject) {
                super(jSONObject);
            }
        }

        public final class Name extends C153197aq implements NewsletterMetadataFields.ThreadMetadata.Name {
            public String BDZ() {
                return A04("text");
            }

            public String getId() {
                return this.A00.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            }

            public Name(JSONObject jSONObject) {
                super(jSONObject);
            }
        }

        public final class Picture extends C153197aq implements NewsletterMetadataFields.ThreadMetadata.Picture {
            public String B75() {
                return A04("direct_path");
            }

            public GraphQLXWA2PictureType BDz() {
                return (GraphQLXWA2PictureType) A03(GraphQLXWA2PictureType.A02, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            }

            public String BE7() {
                return A04("url");
            }

            public String getId() {
                return A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            }

            public Picture(JSONObject jSONObject) {
                super(jSONObject);
            }
        }

        public final class Preview extends C153197aq implements NewsletterMetadataFields.ThreadMetadata.Preview {
            public String B75() {
                return A04("direct_path");
            }

            public GraphQLXWA2PictureType BDz() {
                return (GraphQLXWA2PictureType) A03(GraphQLXWA2PictureType.A02, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            }

            public String BE7() {
                return A04("url");
            }

            public String getId() {
                return A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            }

            public Preview(JSONObject jSONObject) {
                super(jSONObject);
            }
        }

        public final class Settings extends C153197aq implements NewsletterMetadataFields.ThreadMetadata.Settings {

            public final class ReactionCodes extends C153197aq implements NewsletterMetadataFields.ThreadMetadata.Settings.ReactionCodes {
                public String B7J() {
                    return A04("enabled_ts_sec");
                }

                public GraphQLXWA2NewsletterReactionCodesSettingValue BE9() {
                    return (GraphQLXWA2NewsletterReactionCodesSettingValue) A03(GraphQLXWA2NewsletterReactionCodesSettingValue.A04, "value");
                }

                public C129586aY B4i() {
                    return A01();
                }

                public ReactionCodes(JSONObject jSONObject) {
                    super(jSONObject);
                }
            }

            public NewsletterMetadataFields.ThreadMetadata.Settings.ReactionCodes BBs() {
                return (NewsletterMetadataFields.ThreadMetadata.Settings.ReactionCodes) A00(ReactionCodes.class, "reaction_codes");
            }

            public Settings(JSONObject jSONObject) {
                super(jSONObject);
            }
        }

        public String B6D() {
            return A04("creation_time");
        }

        public NewsletterMetadataFields.ThreadMetadata.Description B6w() {
            return (NewsletterMetadataFields.ThreadMetadata.Description) A00(Description.class, "description");
        }

        public String B7z() {
            return A04("handle");
        }

        public String B8T() {
            return A04("invite");
        }

        public NewsletterMetadataFields.ThreadMetadata.Name B9u() {
            return (NewsletterMetadataFields.ThreadMetadata.Name) A00(Name.class, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        }

        public NewsletterMetadataFields.ThreadMetadata.Picture BBK() {
            return (NewsletterMetadataFields.ThreadMetadata.Picture) A00(Picture.class, "picture");
        }

        public NewsletterMetadataFields.ThreadMetadata.Preview BBd() {
            return (NewsletterMetadataFields.ThreadMetadata.Preview) A00(Preview.class, "preview");
        }

        public NewsletterMetadataFields.ThreadMetadata.Settings BCu() {
            return (NewsletterMetadataFields.ThreadMetadata.Settings) A00(Settings.class, "settings");
        }

        public String BDN() {
            return A04("subscribers_count");
        }

        public GraphQLXWA2NewsletterVerifyState BEE() {
            return (GraphQLXWA2NewsletterVerifyState) A03(GraphQLXWA2NewsletterVerifyState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "verification");
        }

        public ThreadMetadata(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    public final class State extends C153197aq implements NewsletterMetadataFields.State {
        public GraphQLXWA2NewsletterStateType BDy() {
            return (GraphQLXWA2NewsletterStateType) A03(GraphQLXWA2NewsletterStateType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        }

        public State(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    public final class ViewerMetadata extends C153197aq implements NewsletterMetadataFields.ViewerMetadata {
        public GraphQLXWA2NewsletterMuteSetting B9s() {
            return (GraphQLXWA2NewsletterMuteSetting) A03(GraphQLXWA2NewsletterMuteSetting.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "mute");
        }

        public GraphQLXWA2NewsletterRole BCK() {
            return (GraphQLXWA2NewsletterRole) A03(GraphQLXWA2NewsletterRole.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "role");
        }

        public ViewerMetadata(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    public NewsletterMetadataFields.State BDI() {
        return (NewsletterMetadataFields.State) A00(State.class, "state");
    }

    public NewsletterMetadataFields.ThreadMetadata BDd() {
        return (NewsletterMetadataFields.ThreadMetadata) A00(ThreadMetadata.class, "thread_metadata");
    }

    public NewsletterMetadataFields.ViewerMetadata BEO() {
        return (NewsletterMetadataFields.ViewerMetadata) A00(ViewerMetadata.class, "viewer_metadata");
    }

    public NewsletterMetadataFieldsImpl(JSONObject jSONObject) {
        super(jSONObject);
    }
}
