package X;

import android.app.Application;
import com.whatsapp.contact.picker.ContactsAttachmentSelector;
import com.whatsapp.registration.directmigration.RestoreFromConsumerDatabaseActivity;

/* renamed from: X.67c  reason: invalid class name and case insensitive filesystem */
public class C1230967c extends C08380eM {
    public Object A00;
    public final int A01;

    public C1230967c(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public C05550Ty Azr(Class cls) {
        Class cls2 = cls;
        if (this.A01 != 0) {
            if (cls2.isAssignableFrom(AnonymousClass10z.class)) {
                RestoreFromConsumerDatabaseActivity restoreFromConsumerDatabaseActivity = (RestoreFromConsumerDatabaseActivity) this.A00;
                AnonymousClass4FS r15 = restoreFromConsumerDatabaseActivity.A04;
                AnonymousClass0N6 r14 = restoreFromConsumerDatabaseActivity.A04;
                C105275Ug r13 = restoreFromConsumerDatabaseActivity.A04;
                C66523Lt r12 = restoreFromConsumerDatabaseActivity.A09;
                C23021Qz r11 = restoreFromConsumerDatabaseActivity.A0K;
                C623834u r10 = restoreFromConsumerDatabaseActivity.A0J;
                AnonymousClass1R1 r9 = restoreFromConsumerDatabaseActivity.A0I;
                C66423Lj r8 = restoreFromConsumerDatabaseActivity.A0A;
                C72303dV r7 = restoreFromConsumerDatabaseActivity.A08;
                AnonymousClass317 r6 = restoreFromConsumerDatabaseActivity.A0C;
                AnonymousClass33p r5 = restoreFromConsumerDatabaseActivity.A09;
                AnonymousClass2QW r4 = restoreFromConsumerDatabaseActivity.A0D;
                C29191iQ r3 = restoreFromConsumerDatabaseActivity.A0G;
                C619632y r2 = restoreFromConsumerDatabaseActivity.A0H;
                C23021Qz r31 = r11;
                C623834u r30 = r10;
                AnonymousClass1R1 r29 = r9;
                C619632y r28 = r2;
                C29191iQ r27 = r3;
                C53282mq r26 = restoreFromConsumerDatabaseActivity.A0F;
                AnonymousClass2QW r25 = r4;
                AnonymousClass317 r24 = r6;
                return new AnonymousClass10z(r13, r14, r5, r7, r12, r8, restoreFromConsumerDatabaseActivity.A0B, r24, r25, r26, r27, r28, r29, r30, r31, r15);
            }
            throw AnonymousClass001.A0c("Invalid viewModel");
        } else if (cls2.isAssignableFrom(AnonymousClass4Ts.class)) {
            ContactsAttachmentSelector contactsAttachmentSelector = (ContactsAttachmentSelector) this.A00;
            Application application = contactsAttachmentSelector.getApplication();
            C54292oU r52 = contactsAttachmentSelector.A03;
            C64773Ex r42 = contactsAttachmentSelector.A0B;
            C620633i r32 = contactsAttachmentSelector.A08;
            C103315Mk r22 = contactsAttachmentSelector.A04;
            C620733j r222 = contactsAttachmentSelector.A0N;
            C54292oU r21 = r52;
            C620633i r20 = r32;
            C64773Ex r19 = r42;
            return new AnonymousClass4Ts(application, contactsAttachmentSelector.A01, r19, r20, r21, r222, r22);
        } else {
            throw AnonymousClass001.A0c("Invalid viewModel");
        }
    }
}
