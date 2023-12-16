package com.whatsapp.infra.graphql.generated.newsletter.enums;

public enum GraphQLXWA2NewsletterRole {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    OWNER("OWNER"),
    ADMIN("ADMIN"),
    SUBSCRIBER("SUBSCRIBER");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    GraphQLXWA2NewsletterRole(String str) {
        this.serverValue = str;
    }

    public String toString() {
        return this.serverValue;
    }
}
