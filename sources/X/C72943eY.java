package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3eY  reason: invalid class name and case insensitive filesystem */
public final class C72943eY implements C186398vF {
    public void BMU(List list) {
        AnonymousClass356.A01("WfsNativeAuthSsoLogger onAnnotate");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("WfsNativeAuthSsoLogger, source: ");
            AnonymousClass356.A05(A0o, ((C142766xj) it.next()).A00());
        }
    }

    public void Bc5() {
        AnonymousClass356.A01("WfsNativeAuthSsoLogger onStart");
    }

    public void BMw(C151917Wu r3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WfsNativeAuthSsoLogger onAuthTokenFetchStart, source: ");
        C142766xj r0 = null;
        if (r3 != null) {
            r0 = r3.A04;
        }
        AnonymousClass356.A05(A0o, AnonymousClass0x2.A0b(r0, A0o, r3));
    }

    public void Bbw(Exception exc, C151917Wu r4) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WfsNativeAuthSsoLogger onSsoCredentialsRetrievalException, source: ");
        C142766xj r0 = null;
        if (r4 != null) {
            r0 = r4.A04;
        }
        AnonymousClass356.A04(AnonymousClass000.A0X(AnonymousClass0x2.A0b(r0, A0o, r4), A0o), exc);
    }

    public void Bbx(C151917Wu r3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WfsNativeAuthSsoLogger onSsoCredentialsRetrievalNoAccountError, source: ");
        C142766xj r0 = null;
        if (r3 != null) {
            r0 = r3.A04;
        }
        AnonymousClass356.A05(A0o, AnonymousClass0x2.A0b(r0, A0o, r3));
    }

    public void Bby(C151917Wu r3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WfsNativeAuthSsoLogger onSsoCredentialsRetrieved, source: ");
        C142766xj r0 = null;
        if (r3 != null) {
            r0 = r3.A04;
        }
        AnonymousClass356.A05(A0o, AnonymousClass0x2.A0b(r0, A0o, r3));
    }

    public void Bbz(C151917Wu r3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WfsNativeAuthSsoLogger onSsoProviderNoTrusted, source: ");
        C142766xj r0 = null;
        if (r3 != null) {
            r0 = r3.A04;
        }
        AnonymousClass356.A05(A0o, AnonymousClass0x2.A0b(r0, A0o, r3));
    }

    public void Bc0(Map map, C151917Wu r6) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WfsNativeAuthSsoLogger onSsoProviderNotFound, source: ");
        C142766xj r0 = null;
        if (r6 != null) {
            r0 = r6.A04;
        }
        AnonymousClass356.A05(A0o, AnonymousClass0x2.A0b(r0, A0o, r6));
        if (map != null) {
            Iterator A0i = C18280x3.A0i(map);
            while (A0i.hasNext()) {
                String A0m = AnonymousClass001.A0m(A0i);
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("WfsNativeAuthSsoLogger, key: ");
                A0o2.append(A0m);
                A0o2.append(" value: ");
                AnonymousClass356.A05(A0o2, C18310x6.A0o(A0m, map));
            }
        }
    }

    public void Bc1(C151917Wu r3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WfsNativeAuthSsoLogger onSsoProviderResolved, source: ");
        C142766xj r0 = null;
        if (r3 != null) {
            r0 = r3.A04;
        }
        AnonymousClass356.A05(A0o, AnonymousClass0x2.A0b(r0, A0o, r3));
    }

    public void Bec(C151917Wu r3, AnonymousClass8RZ r4) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WfsNativeAuthSsoLogger onTransformerException, source: ");
        A0o.append(r3.A04);
        A0o.append(", package name: ");
        AnonymousClass356.A04(AnonymousClass000.A0X(r3.A02, A0o), r4);
    }
}
