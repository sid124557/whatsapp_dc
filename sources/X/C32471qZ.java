package X;

import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.migration.export.service.MessagesExporterService;
import com.whatsapp.util.Log;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.1qZ  reason: invalid class name and case insensitive filesystem */
public abstract class C32471qZ extends C18400xH {
    public int A00 = -1;
    public C55682qk A01;
    public AnonymousClass4FS A02;
    public final C188168yS A03 = C129306a6.create();
    public final String A04 = "xpm-msg-exporter-svc";
    public final Set A05 = AnonymousClass002.A0K();

    public final void A00() {
        synchronized (this) {
            if (this.A03.isEmpty() && this.A05.isEmpty()) {
                stopSelf(this.A00);
            }
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        Set set;
        Integer valueOf;
        C55682qk r4;
        String str;
        String str2;
        String str3;
        Object obj;
        boolean z;
        synchronized (this) {
            i3 = i2;
            if (i3 > this.A00) {
                this.A00 = i3;
            }
            set = this.A05;
            valueOf = Integer.valueOf(i3);
            set.add(valueOf);
        }
        MessagesExporterService messagesExporterService = (MessagesExporterService) this;
        Log.d("xpm-export-service-onStart");
        if (intent == null) {
            Log.i("xpm-export-service-onStartCommand()/intent is null");
        } else {
            if ("ACTION_START_EXPORT".equals(intent.getAction())) {
                C56582sE r5 = messagesExporterService.A00;
                synchronized (r5) {
                    if (r5.A00 == null) {
                        z = false;
                        if (r5.A01 != null) {
                        }
                    }
                    z = true;
                }
                if (z || messagesExporterService.A00.A09()) {
                    Log.i("xpm-export-service-onStartCommand()/export in progress");
                    r4 = messagesExporterService.A01;
                    str = "xpm-export-service-export-duplicated-start";
                    str2 = "xpm-export-service-onStartCommand: duplicated call with ACTION_START_EXPORT event - there is another task running export or cancellation";
                    r4.A0A(str, false, str2);
                }
            }
            if (C18280x3.A1V(intent, "ACTION_CANCEL_EXPORT")) {
                if (messagesExporterService.A00.A09()) {
                    Log.i("xpm-export-service-onStartCommand()/cancellation in already in progress");
                    r4 = messagesExporterService.A01;
                    str = "xpm-export-service-cancel-duplicated-start";
                    str2 = "xpm-export-service-onStartCommand: duplicated call with ACTION_CANCEL_EXPORT event - there is another task running cancellation";
                    r4.A0A(str, false, str2);
                } else {
                    Log.i("xpm-export-service-onStartCommand()/action_cancel_export");
                    C52582li r0 = messagesExporterService.A01;
                    C05610Ue A002 = r0.A00();
                    A002.A0B(C54292oU.A00(r0.A00).getString(R.string.f11nameremoved));
                    messagesExporterService.startForeground(31, A002.A01());
                    C56582sE r1 = messagesExporterService.A00;
                    Objects.requireNonNull(r1);
                    obj = new C70023Zo(r1, 5);
                    str3 = "cancel-export";
                }
            } else if (C18280x3.A1V(intent, "ACTION_START_EXPORT")) {
                Log.i("xpm-export-service-onStartCommand()/action_start_export");
                C52582li r02 = messagesExporterService.A01;
                C05610Ue A003 = r02.A00();
                A003.A0B(C54292oU.A00(r02.A00).getString(R.string.f11nameremoved));
                messagesExporterService.startForeground(31, A003.A01());
                obj = new C70113Zy(messagesExporterService, 22, intent);
                str3 = "export-data";
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(messagesExporterService.A04);
            A0o.append("/");
            A0o.append(str3);
            C18260x0.A0y("; async task scheduled (foreground), start_id=", A0o, i3);
            messagesExporterService.A02.BkP(new C70473aY(messagesExporterService, obj, str3, i3, 9));
            synchronized (this) {
                messagesExporterService.A03.add(valueOf);
            }
        }
        synchronized (this) {
            set.remove(valueOf);
            A00();
        }
        return 2;
    }
}
