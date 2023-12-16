package X;

import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.calling.telecom.SelfManagedConnectionService;
import java.util.Random;

/* renamed from: X.1Ec  reason: invalid class name and case insensitive filesystem */
public final class C22031Ec extends C64323Da {
    public AnonymousClass4C1 A00;
    public AnonymousClass4C1 A01;
    public AnonymousClass4C1 A02;
    public AnonymousClass4C1 A03;
    public AnonymousClass4C1 A04;
    public final C22031Ec A05 = this;
    public final C64333Db A06;

    public final void A0e() {
        this.A04 = new C72253dQ(this.A05, this.A06, 0);
        this.A00 = C72313dW.A00(new C72253dQ(this.A05, this.A06, 1));
        this.A01 = C72313dW.A00(new C72253dQ(this.A05, this.A06, 2));
        this.A02 = C72313dW.A00(new C72253dQ(this.A05, this.A06, 3));
        this.A03 = new C72253dQ(this.A05, this.A06, 4);
    }

    public final void A0g(SelfManagedConnectionService selfManagedConnectionService) {
        A0c(selfManagedConnectionService, (C111665iU) this.A06.AUP.get());
    }

    public C22031Ec(C64333Db r1) {
        this.A06 = r1;
        A0e();
    }

    public final void A0f(GoogleBackupService googleBackupService) {
        A0b(googleBackupService, AnonymousClass3YX.A00());
        A0H(googleBackupService, (C56612sH) this.A06.ASO.get());
        A0S(googleBackupService, (AnonymousClass1VX) this.A06.A07.get());
        A02((C69263Wi) this.A06.AG7.get(), googleBackupService);
        A00((C55682qk) this.A06.A75.get(), googleBackupService);
        A03((C56972sr) this.A06.AJW.get(), googleBackupService);
        A0I(googleBackupService, (C54292oU) this.A06.AaB.get());
        A01((C64393Dh) this.A06.AS1.get(), googleBackupService);
        A0T(googleBackupService, (AnonymousClass4FV) this.A06.ASY.get());
        A0E(googleBackupService, (AnonymousClass310) this.A06.A9r.get());
        A0W(googleBackupService, (C28861ht) this.A06.AJH.get());
        A0V(googleBackupService, (AnonymousClass31C) this.A06.AKw.get());
        A0D(googleBackupService, (AnonymousClass5PA) this.A06.A25.get());
        A0G(googleBackupService, (C620633i) this.A06.AYG.get());
        A0U(googleBackupService, this.A06.AoF());
        A0Z(googleBackupService, (C34171uL) this.A06.AbZ.get());
        A05((AnonymousClass0WN) this.A06.A8q.get(), googleBackupService);
        A0Y(googleBackupService, (C623834u) this.A06.A00.AC9.get());
        A0F(googleBackupService, (C56512s6) this.A06.AK3.get());
        A0Q(googleBackupService, (C48602fA) this.A06.AMy.get());
        A0M(googleBackupService, (AnonymousClass319) this.A06.AJv.get());
        A0X(googleBackupService, (C618232j) this.A06.AJx.get());
        A0N(googleBackupService, (C625835r) this.A06.AM8.get());
        A08((C06260Ww) this.A06.AG9.get(), googleBackupService);
        A0P(googleBackupService, (C72303dV) this.A06.AMC.get());
        A0C(googleBackupService, (AnonymousClass0QR) this.A06.ATu.get());
        A0J(googleBackupService, (AnonymousClass5ZR) this.A06.Aag.get());
        A0K(googleBackupService, (AnonymousClass33p) this.A06.Aaj.get());
        A0L(googleBackupService, (C613830m) this.A06.AJa.get());
        A04((AnonymousClass0U8) this.A06.A1x.get(), googleBackupService);
        A06((AnonymousClass0WF) this.A06.A00.A0q.get(), googleBackupService);
        A0O(googleBackupService, (C55272q5) this.A06.AMB.get());
        A07((C10240hc) this.A06.AG8.get(), googleBackupService);
        A09((AnonymousClass0F1) this.A06.AGA.get(), googleBackupService);
        A0B(googleBackupService, (C10230hb) this.A06.AGC.get());
        A0A((AnonymousClass0QJ) this.A06.AGB.get(), googleBackupService);
        A0R(googleBackupService, (AnonymousClass1VW) this.A06.A03.get());
        A0a(googleBackupService, C72343dZ.A00(this.A06.AUj));
    }

    public void A0d(SelfManagedConnectionService selfManagedConnectionService) {
        A0g(selfManagedConnectionService);
    }

    public void BGQ(GoogleBackupService googleBackupService) {
        A0f(googleBackupService);
    }

    public static void A00(C55682qk r0, GoogleBackupService googleBackupService) {
        googleBackupService.A01 = r0;
    }

    public static void A01(C64393Dh r0, GoogleBackupService googleBackupService) {
        googleBackupService.A02 = r0;
    }

    public static void A02(C69263Wi r0, GoogleBackupService googleBackupService) {
        googleBackupService.A03 = r0;
    }

    public static void A03(C56972sr r0, GoogleBackupService googleBackupService) {
        googleBackupService.A04 = r0;
    }

    public static void A04(AnonymousClass0U8 r0, GoogleBackupService googleBackupService) {
        googleBackupService.A05 = r0;
    }

    public static void A05(AnonymousClass0WN r0, GoogleBackupService googleBackupService) {
        googleBackupService.A06 = r0;
    }

    public static void A06(AnonymousClass0WF r0, GoogleBackupService googleBackupService) {
        googleBackupService.A07 = r0;
    }

    public static void A07(C10240hc r0, GoogleBackupService googleBackupService) {
        googleBackupService.A08 = r0;
    }

    public static void A08(C06260Ww r0, GoogleBackupService googleBackupService) {
        googleBackupService.A09 = r0;
    }

    public static void A09(AnonymousClass0F1 r0, GoogleBackupService googleBackupService) {
        googleBackupService.A0A = r0;
    }

    public static void A0A(AnonymousClass0QJ r0, GoogleBackupService googleBackupService) {
        googleBackupService.A0B = r0;
    }

    public static void A0B(GoogleBackupService googleBackupService, C10230hb r1) {
        googleBackupService.A0C = r1;
    }

    public static void A0C(GoogleBackupService googleBackupService, AnonymousClass0QR r1) {
        googleBackupService.A0D = r1;
    }

    public static void A0D(GoogleBackupService googleBackupService, AnonymousClass5PA r1) {
        googleBackupService.A0E = r1;
    }

    public static void A0E(GoogleBackupService googleBackupService, AnonymousClass310 r1) {
        googleBackupService.A0F = r1;
    }

    public static void A0F(GoogleBackupService googleBackupService, C56512s6 r1) {
        googleBackupService.A0G = r1;
    }

    public static void A0G(GoogleBackupService googleBackupService, C620633i r1) {
        googleBackupService.A0H = r1;
    }

    public static void A0H(GoogleBackupService googleBackupService, C56612sH r1) {
        googleBackupService.A0I = r1;
    }

    public static void A0I(GoogleBackupService googleBackupService, C54292oU r1) {
        googleBackupService.A0J = r1;
    }

    public static void A0J(GoogleBackupService googleBackupService, AnonymousClass5ZR r1) {
        googleBackupService.A0K = r1;
    }

    public static void A0K(GoogleBackupService googleBackupService, AnonymousClass33p r1) {
        googleBackupService.A0L = r1;
    }

    public static void A0L(GoogleBackupService googleBackupService, C613830m r1) {
        googleBackupService.A0M = r1;
    }

    public static void A0M(GoogleBackupService googleBackupService, AnonymousClass319 r1) {
        googleBackupService.A0N = r1;
    }

    public static void A0N(GoogleBackupService googleBackupService, C625835r r1) {
        googleBackupService.A0O = r1;
    }

    public static void A0O(GoogleBackupService googleBackupService, C55272q5 r1) {
        googleBackupService.A0P = r1;
    }

    public static void A0P(GoogleBackupService googleBackupService, C72303dV r1) {
        googleBackupService.A0Q = r1;
    }

    public static void A0Q(GoogleBackupService googleBackupService, C48602fA r1) {
        googleBackupService.A0R = r1;
    }

    public static void A0R(GoogleBackupService googleBackupService, AnonymousClass1VW r1) {
        googleBackupService.A0S = r1;
    }

    public static void A0S(GoogleBackupService googleBackupService, AnonymousClass1VX r1) {
        googleBackupService.A0T = r1;
    }

    public static void A0T(GoogleBackupService googleBackupService, AnonymousClass4FV r1) {
        googleBackupService.A0U = r1;
    }

    public static void A0U(GoogleBackupService googleBackupService, C59302wh r1) {
        googleBackupService.A0V = r1;
    }

    public static void A0V(GoogleBackupService googleBackupService, AnonymousClass31C r1) {
        googleBackupService.A0W = r1;
    }

    public static void A0W(GoogleBackupService googleBackupService, C28861ht r1) {
        googleBackupService.A0X = r1;
    }

    public static void A0X(GoogleBackupService googleBackupService, C618232j r1) {
        googleBackupService.A0Y = r1;
    }

    public static void A0Y(GoogleBackupService googleBackupService, C623834u r1) {
        googleBackupService.A0Z = r1;
    }

    public static void A0Z(GoogleBackupService googleBackupService, C34171uL r1) {
        googleBackupService.A0a = r1;
    }

    public static void A0a(GoogleBackupService googleBackupService, C183538qC r1) {
        googleBackupService.A0b = r1;
    }

    public static void A0b(GoogleBackupService googleBackupService, Random random) {
        googleBackupService.A0d = random;
    }

    public static void A0c(SelfManagedConnectionService selfManagedConnectionService, C111665iU r1) {
        selfManagedConnectionService.A00 = r1;
    }
}
