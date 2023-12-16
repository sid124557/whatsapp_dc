package X;

import com.whatsapp.businessdirectory.util.DirectoryGPSLocationManager;

/* renamed from: X.6Av  reason: invalid class name and case insensitive filesystem */
public class C124066Av implements C181958nd {
    public Object A00;
    public final int A01;

    public C124066Av(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public DirectoryGPSLocationManager Azx(C181698nB r14, String str) {
        C181698nB r4 = r14;
        String str2 = str;
        switch (this.A01) {
            case 0:
                C124066Av r1 = this;
                C54292oU r7 = (C54292oU) ((C118055sv) r1.A00).A04.AaB.get();
                C620633i r6 = (C620633i) ((C118055sv) r1.A00).A04.AYG.get();
                C620733j r9 = (C620733j) ((C118055sv) r1.A00).A04.AbU.get();
                return new DirectoryGPSLocationManager((C69263Wi) ((C118055sv) r1.A00).A04.AG7.get(), r4, ((C118055sv) r1.A00).A04.A00.AJe(), r6, r7, (AnonymousClass5ZR) ((C118055sv) r1.A00).A04.Aag.get(), r9, (AnonymousClass1VX) ((C118055sv) r1.A00).A04.A07.get(), (AnonymousClass4FS) ((C118055sv) r1.A00).A04.AbX.get(), str2);
            case 1:
                C124066Av r12 = this;
                C54292oU r72 = (C54292oU) ((C118085sy) r12.A00).A01.AaB.get();
                C620633i r62 = (C620633i) ((C118085sy) r12.A00).A01.AYG.get();
                C620733j r92 = (C620733j) ((C118085sy) r12.A00).A01.AbU.get();
                return new DirectoryGPSLocationManager((C69263Wi) ((C118085sy) r12.A00).A01.AG7.get(), r4, ((C118085sy) r12.A00).A01.A00.AJe(), r62, r72, (AnonymousClass5ZR) ((C118085sy) r12.A00).A01.Aag.get(), r92, (AnonymousClass1VX) ((C118085sy) r12.A00).A01.A07.get(), (AnonymousClass4FS) ((C118085sy) r12.A00).A01.AbX.get(), str2);
            default:
                return null;
        }
    }
}
