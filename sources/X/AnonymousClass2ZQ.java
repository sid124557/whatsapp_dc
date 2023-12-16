package X;

import android.content.Context;
import com.whatsapp.AbstractAppShellDelegate;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import java.util.Set;

/* renamed from: X.2ZQ  reason: invalid class name */
public final class AnonymousClass2ZQ {
    public final C54292oU A00;
    public final WhatsAppLibLoader A01;
    public final Set A02;

    public final synchronized void A00(C142376x6 r7) {
        C162457s7.A0J(r7, 0);
        C626936e.A00();
        Set set = this.A02;
        if (!set.contains(r7)) {
            try {
                WhatsAppLibLoader whatsAppLibLoader = this.A01;
                Context context = this.A00.A00;
                String[] A1Y = AnonymousClass0x9.A1Y();
                A1Y[0] = r7.libName;
                boolean A022 = whatsAppLibLoader.A06.A02(context, AbstractAppShellDelegate.COMPRESSED_LIBS_ARCHIVE_NAME);
                String str = A1Y[0];
                if (!A022 || !AnonymousClass34Z.A01(context, str)) {
                    WhatsAppLibLoader.A00(context, str);
                }
            } catch (UnsatisfiedLinkError e) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("DynamicLibraryLoader/maybeLoadLibrary ");
                A0o.append(r7.libName);
                C18260x0.A14(" failed", A0o, e);
            }
            set.add(r7);
        }
    }

    public AnonymousClass2ZQ(C54292oU r2, WhatsAppLibLoader whatsAppLibLoader) {
        C18260x0.A0Q(r2, whatsAppLibLoader);
        this.A00 = r2;
        this.A01 = whatsAppLibLoader;
        Set A0u = C18320x8.A0u();
        C162457s7.A0D(A0u);
        this.A02 = A0u;
    }
}
