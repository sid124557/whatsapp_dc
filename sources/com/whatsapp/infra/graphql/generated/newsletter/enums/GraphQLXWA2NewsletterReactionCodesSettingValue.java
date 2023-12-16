package com.whatsapp.infra.graphql.generated.newsletter.enums;

public enum GraphQLXWA2NewsletterReactionCodesSettingValue {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    ALL("ALL"),
    BASIC("BASIC"),
    BLOCKLIST("BLOCKLIST");
    
    public final String serverValue;

    /* access modifiers changed from: public */
    GraphQLXWA2NewsletterReactionCodesSettingValue(String str) {
        this.serverValue = str;
    }

    public String toString() {
        return this.serverValue;
    }
}
