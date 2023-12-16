package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass1VX;
import X.C28011fL;
import X.C389229y;
import X.C46412ba;
import X.C56892sj;
import X.C56972sr;
import X.C56982ss;
import X.C64333Db;
import android.content.Context;
import java.util.Set;

public class AxolotlMultiDeviceSenderKeyRequirement extends AxolotlMultiDeviceSessionRequirement {
    public static final long serialVersionUID = 1;
    public transient C56972sr A00;
    public transient C56982ss A01;
    public transient C46412ba A02;
    public transient C56892sj A03;
    public transient AnonymousClass1VX A04;
    public final String groupParticipantHash;
    public final boolean useLidForEncryption;
    public final boolean useParticipantUserHash;

    public AxolotlMultiDeviceSenderKeyRequirement(C28011fL r7, Boolean bool, String str, String str2, Set set, byte b, boolean z, boolean z2) {
        super(r7, bool, str, set, b);
        this.groupParticipantHash = str2;
        this.useLidForEncryption = z;
        this.useParticipantUserHash = z2;
    }

    public void Bm4(Context context) {
        super.Bm4(context);
        C64333Db A002 = C389229y.A00(context);
        this.A04 = A002.Avy();
        this.A00 = A002.BL4();
        this.A01 = C64333Db.A39(A002);
        this.A02 = (C46412ba) A002.AGk.get();
        this.A03 = C64333Db.A3G(A002);
    }
}
