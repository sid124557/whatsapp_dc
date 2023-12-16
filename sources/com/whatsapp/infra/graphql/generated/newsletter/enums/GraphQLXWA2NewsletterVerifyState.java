package com.whatsapp.infra.graphql.generated.newsletter.enums;

public enum GraphQLXWA2NewsletterVerifyState {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    VERIFIED("VERIFIED");
    
    public final String serverValue;

    public String toString() {
        return this.serverValue;
    }

    /* access modifiers changed from: public */
    GraphQLXWA2NewsletterVerifyState(String str) {
        this.serverValue = str;
    }
}
