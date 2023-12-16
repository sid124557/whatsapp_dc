package X;

import java.util.List;

/* renamed from: X.5kJ  reason: invalid class name and case insensitive filesystem */
public class C112795kJ implements C182128nu {
    public final String A00;
    public final List A01;

    public AnonymousClass3ZH getContact() {
        return (AnonymousClass3ZH) C18290x4.A0k(this.A01);
    }

    public C112795kJ(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NonWhatsAppContactListItem{displayName='");
        A0o.append(this.A00);
        A0o.append('\'');
        A0o.append(", waContactList=");
        return AnonymousClass000.A0Q(this.A01, A0o);
    }
}
