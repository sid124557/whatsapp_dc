package X;

import com.whatsapp.contact.picker.AddGroupParticipantsSelector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5wr  reason: invalid class name and case insensitive filesystem */
public final class C119365wr extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AddGroupParticipantsSelector this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119365wr(AddGroupParticipantsSelector addGroupParticipantsSelector) {
        super(0);
        this.this$0 = addGroupParticipantsSelector;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Map map = this.this$0.A0E;
        if (map != null) {
            LinkedHashMap A0r = C18320x8.A0r();
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                Object key = A0w.getKey();
                if (C162457s7.A0P(key, "com.whatsapp.contact.picker.DeviceContactsLoader") || C162457s7.A0P(key, "com.whatsapp.contact.picker.RecentlyAcceptedInviteContactsLoader") || C162457s7.A0P(key, "com.whatsapp.contact.picker.NonWaContactsLoader") || C162457s7.A0P(key, "com.whatsapp.community.DirectoryContactsLoader")) {
                    C18270x1.A1N(A0r, A0w);
                }
            }
            ArrayList A0I = AnonymousClass002.A0I(A0r.size());
            Iterator A0q2 = AnonymousClass000.A0q(A0r);
            while (A0q2.hasNext()) {
                A0I.add(AnonymousClass0x2.A0W(A0q2));
            }
            return C73723fy.A0P(A0I);
        }
        throw C18270x1.A0S("contactsLoaderMap");
    }
}
