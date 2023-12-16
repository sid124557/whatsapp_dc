package com.whatsapp.fieldstats.extension;

import X.AnonymousClass001;
import X.AnonymousClass4AD;
import com.whatsapp.fieldstats.events.WamCall;
import java.util.List;

public final class WamCallExtended extends WamCall {
    public List fields = AnonymousClass001.A0s();

    public void addField(WamCallExtendedField wamCallExtendedField) {
        this.fields.add(wamCallExtendedField);
    }

    public void serialize(AnonymousClass4AD r4) {
        super.serialize(r4);
        List<WamCallExtendedField> list = this.fields;
        if (list != null) {
            for (WamCallExtendedField wamCallExtendedField : list) {
                r4.Blb(wamCallExtendedField.fieldId, wamCallExtendedField.fieldValue);
            }
        }
    }
}
