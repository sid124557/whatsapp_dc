package X;

import com.whatsapp.contact.picker.AddGroupParticipantsSelector;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.3tV  reason: invalid class name and case insensitive filesystem */
public final class C77503tV extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AddGroupParticipantsSelector this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77503tV(AddGroupParticipantsSelector addGroupParticipantsSelector) {
        super(0);
        this.this$0 = addGroupParticipantsSelector;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Set<Object> set;
        AddGroupParticipantsSelector addGroupParticipantsSelector = this.this$0;
        String[] stringArrayExtra = addGroupParticipantsSelector.getIntent().getStringArrayExtra("contacts_loader_keys");
        AnonymousClass2FY r5 = addGroupParticipantsSelector.A04;
        if (r5 != null) {
            if (stringArrayExtra == null || (set = C73703fw.A05(stringArrayExtra)) == null) {
                set = AnonymousClass002.A0K();
            }
            Set set2 = (Set) addGroupParticipantsSelector.A0L.getValue();
            if (set2 == null) {
                set2 = C18290x4.A13(AnonymousClass3F1.A00);
            }
            if (!set.isEmpty()) {
                ArrayList A0s = AnonymousClass001.A0s();
                for (Object obj : set) {
                    Object obj2 = r5.A00.get(obj);
                    if (obj2 != null) {
                        A0s.add(obj2);
                    }
                }
                Set A0P = C73723fy.A0P(A0s);
                if (!A0P.isEmpty()) {
                    return new AnonymousClass2FZ(A0P);
                }
            }
            return new AnonymousClass2FZ(set2);
        }
        throw C18270x1.A0S("contactsLoaderFactory");
    }
}
