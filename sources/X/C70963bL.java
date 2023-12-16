package X;

import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.3bL  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70963bL implements Runnable {
    public final /* synthetic */ ContactPickerFragment A00;
    public final /* synthetic */ C106105Xq A01;
    public final /* synthetic */ C95814uZ A02;
    public final /* synthetic */ C95804uY A03;
    public final /* synthetic */ C53042mS A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;

    public final void run() {
        ContactPickerFragment contactPickerFragment = this.A00;
        C53042mS r7 = this.A04;
        C95804uY r6 = this.A03;
        C95814uZ r5 = this.A02;
        List list = this.A05;
        List list2 = this.A06;
        C106105Xq r10 = this.A01;
        boolean z = this.A07;
        AnonymousClass4FU r11 = contactPickerFragment.A0a.A00;
        if (r11 instanceof C187388x8) {
            C111415i3 r8 = new C111415i3(contactPickerFragment, r6, r7);
            AnonymousClass4FS r1 = contactPickerFragment.A2c;
            AnonymousClass5M1 r72 = contactPickerFragment.A0X;
            List singletonList = Collections.singletonList(r5);
            Map emptyMap = Collections.emptyMap();
            HashSet A0K = AnonymousClass002.A0K();
            AnonymousClass0x7.A1B(r72.A00(r8, contactPickerFragment.A1o, r10, (C187388x8) r11, (C624134x) null, 1, 0L, (Long) null, (Long) null, list2, A0K, AnonymousClass0x9.A15(list), singletonList, list, emptyMap, 3, 0, -1, false, true, false, true, false, false), r1);
            if (z) {
                contactPickerFragment.A19.A02();
            }
        }
    }

    public /* synthetic */ C70963bL(ContactPickerFragment contactPickerFragment, C106105Xq r2, C95814uZ r3, C95804uY r4, C53042mS r5, List list, List list2, boolean z) {
        this.A00 = contactPickerFragment;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A05 = list;
        this.A06 = list2;
        this.A01 = r2;
        this.A07 = z;
    }
}
