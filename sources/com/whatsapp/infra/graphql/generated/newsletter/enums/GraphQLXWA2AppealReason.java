package com.whatsapp.infra.graphql.generated.newsletter.enums;

public enum GraphQLXWA2AppealReason {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    UNKNOWN("UNKNOWN"),
    UNJUSTIFIED_SUSPENSION("UNJUSTIFIED_SUSPENSION"),
    MISUNDERSTOOD_UPDATES("MISUNDERSTOOD_UPDATES"),
    FOLLOWED_GUIDELINES("FOLLOWED_GUIDELINES");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    GraphQLXWA2AppealReason(String str) {
        this.serverValue = str;
    }

    public String toString() {
        return this.serverValue;
    }
}
