package com.whatsapp.infra.graphql.generated.suggestedcontacts.enums;

public enum GraphQLXWA2SuggestedContactsSignalType {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    PRESENCE("PRESENCE"),
    PROFILE_PICTURE("PROFILE_PICTURE");
    
    public final String serverValue;

    public String toString() {
        return this.serverValue;
    }

    /* access modifiers changed from: public */
    GraphQLXWA2SuggestedContactsSignalType(String str) {
        this.serverValue = str;
    }
}
