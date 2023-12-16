package X;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.HomeActivity;
import com.whatsapp.Me;
import com.whatsapp.R;
import com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker;
import com.whatsapp.camera.CameraActivity;
import com.whatsapp.chatlock.ChatLockAuthActivity;
import com.whatsapp.chatlock.ChatLockAuthViewModel;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.contact.picker.AddGroupParticipantsSelector;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.whatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.inappbugreporting.InAppBugReportingActivity;
import com.whatsapp.inappbugreporting.InAppBugReportingViewModel;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.quickcontact.QuickContactActivity;
import com.whatsapp.registration.ChangeNumber;
import com.whatsapp.registration.EULA;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.registration.VerifyPhoneNumber;
import com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity;
import com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.settings.Settings;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.status.playback.avatar.AvatarReactionRepository;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.util.Collection;
import java.util.List;

/* renamed from: X.4SG  reason: invalid class name */
public abstract class AnonymousClass4SG extends C009707r implements AnonymousClass4GJ {
    public boolean A00 = false;
    public final Object A01 = AnonymousClass002.A0D();
    public volatile C116865qz A02;

    private void A33() {
        AnonymousClass68W.A00(this, 3);
    }

    public static void A39(Menu menu) {
        if (menu != null) {
            menu.add(0, 1, 0, R.string.f11nameremoved);
        }
    }

    public static void A3l(PopupNotification popupNotification, C55602qc r2) {
        r2.A04(true);
        C624134x r0 = popupNotification.A1A;
        if (r0 != null) {
            popupNotification.A1f.add(r0.A1J);
        }
    }

    public static void A3s(VerifyPhoneNumber verifyPhoneNumber, int i, long j) {
        verifyPhoneNumber.A82(verifyPhoneNumber.getString(i, new Object[]{C107565bW.A0D(verifyPhoneNumber.A00, j)}));
    }

    public static int A2J(HomeActivity homeActivity) {
        C46332bS r0 = (C46332bS) homeActivity.A28.get();
        r0.A00();
        return r0.A00.size();
    }

    public static int A2K(C89644eZ r0) {
        return r0.A09.A00();
    }

    public static int A2L(MediaComposerActivity mediaComposerActivity) {
        return ((List) mediaComposerActivity.A0t.A03.A07()).size();
    }

    public static long A2M(C108935do r3) {
        return Long.parseLong(r3.A0L) * 1000;
    }

    public static long A2N(VerifyPhoneNumber verifyPhoneNumber, String str) {
        return verifyPhoneNumber.A10.A00(str);
    }

    public static Intent A2O(DeepLinkActivity deepLinkActivity) {
        return new Intent(deepLinkActivity, deepLinkActivity.A0p.A0G().BBA());
    }

    public static SharedPreferences.Editor A2P(C89654ea r0) {
        return r0.A09.A0U();
    }

    public static C1229966q A2a(HomeActivity homeActivity) {
        return homeActivity.A7N(HomeActivity.A0C(homeActivity.A06));
    }

    public static Me A2b(C89644eZ r0) {
        C56972sr r02 = r0.A01;
        r02.A0P();
        return r02.A00;
    }

    public static AnonymousClass1RR A2c(C89644eZ r0) {
        C56972sr r02 = r0.A01;
        r02.A0P();
        return r02.A01;
    }

    public static C614930z A2e(HomeActivity homeActivity) {
        return (C614930z) homeActivity.A1Q.get();
    }

    public static AnonymousClass5J0 A2f(EULA eula) {
        return ((C103365Mp) eula.A0Y.get()).A01();
    }

    public static ChatLockAuthViewModel A2g(ChatLockAuthActivity chatLockAuthActivity) {
        return (ChatLockAuthViewModel) chatLockAuthActivity.A0A.getValue();
    }

    public static AnonymousClass5S6 A2h(AddGroupParticipantsSelector addGroupParticipantsSelector, AnonymousClass3ZH r2) {
        AnonymousClass5S6 r0 = (AnonymousClass5S6) addGroupParticipantsSelector.A0H.get(r2.A0H);
        if (r0 == null) {
            return AddGroupParticipantsSelector.A0S;
        }
        return r0;
    }

    public static C619532x A2i(GroupCallParticipantPicker groupCallParticipantPicker) {
        return (C619532x) groupCallParticipantPicker.A06.get();
    }

    public static AnonymousClass5IY A2j(C64333Db r0) {
        return (AnonymousClass5IY) r0.A00.A41.get();
    }

    public static EmojiSearchProvider A2k(C64333Db r0) {
        return (EmojiSearchProvider) r0.A00.A40.get();
    }

    public static AnonymousClass5YF A2l(Uri uri, MediaComposerActivity mediaComposerActivity) {
        return mediaComposerActivity.A1n.A00(uri);
    }

    public static PhoneUserJid A2m(C89644eZ r0) {
        C56972sr r02 = r0.A01;
        r02.A0P();
        return r02.A05;
    }

    public static C97694z5 A2p(C89654ea r1) {
        return new C97694z5(r1.A09.A0F());
    }

    public static C56502s5 A2q(C107695bk r0) {
        return (C56502s5) r0.A5N.get();
    }

    public static AnonymousClass5XO A2s(C107695bk r0) {
        return (AnonymousClass5XO) r0.A7B.get();
    }

    public static Object A2t(C64333Db r1, C107695bk r2, C89654ea r3) {
        r3.A0B = (AnonymousClass487) r2.A9c.get();
        return r1.ASO.get();
    }

    public static String A2u(C89644eZ r0) {
        return r0.A01.A0D.A03();
    }

    public static String A2w(VerifyPhoneNumber verifyPhoneNumber) {
        AnonymousClass5ZR r1 = verifyPhoneNumber.A0h;
        if (verifyPhoneNumber.A1W) {
            return "2";
        }
        if (r1.A02("android.permission.RECEIVE_SMS") == 0) {
            return "1";
        }
        return "0";
    }

    public static String A2x(DeviceConfirmationRegistrationActivity deviceConfirmationRegistrationActivity) {
        String str = deviceConfirmationRegistrationActivity.A07.A01;
        C626936e.A06(str);
        String str2 = deviceConfirmationRegistrationActivity.A07.A00;
        C626936e.A06(str2);
        String A0C = AnonymousClass36l.A0C(str2, str);
        C626936e.A06(A0C);
        return deviceConfirmationRegistrationActivity.A00.A0I(A0C.replace(' ', 160));
    }

    public static StringBuilder A2y(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("VerifyPhoneNumber/verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        return sb;
    }

    public static StringBuilder A2z(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("VerifyPhoneNumber/verifyvoice/request/");
        sb.append(str);
        return sb;
    }

    public static Collection A30(MediaComposerActivity mediaComposerActivity) {
        return (Collection) mediaComposerActivity.A0t.A01.A07();
    }

    public static List A31(MediaComposerActivity mediaComposerActivity) {
        return (List) mediaComposerActivity.A0t.A03.A07();
    }

    public static AnonymousClass4C1 A32(C64333Db r1, C89704el r2) {
        r2.A04 = (AnonymousClass4FS) r1.AbX.get();
        return r1.A07;
    }

    public static void A3D(C89104bW r1, C64333Db r2) {
        r1.A00 = new AnonymousClass5QT();
        r1.A03 = C88744aj.A00;
        r1.A0E = (C114015mM) r2.A6T.get();
        r1.A0A = (C64773Ex) r2.A6O.get();
        r1.A0C = (AnonymousClass5ZU) r2.AaA.get();
        r1.A07 = (C56962sq) r2.A2b.get();
        r1.A08 = (C29301ib) r2.A57.get();
        r1.A09 = (C44772Xk) r2.A6I.get();
        r1.A0H = (AnonymousClass2ML) r2.AIy.get();
        r1.A0F = (C29241iV) r2.AGn.get();
        r1.A06 = (AnonymousClass64J) r2.AEN.get();
        r1.A0B = (C29421in) r2.A6P.get();
    }

    public static void A3E(C88834as r1, C64333Db r2, C107695bk r3, AnonymousClass30B r4, CameraActivity cameraActivity) {
        cameraActivity.A02 = r4;
        cameraActivity.A09 = (C50022hV) r2.AFU.get();
        cameraActivity.A08 = r2.AkL();
        cameraActivity.A04 = (C102985La) r1.A0J.get();
        cameraActivity.A0C = r1.AD1();
        cameraActivity.A0B = (C49632gq) r3.A2E.get();
        cameraActivity.A01 = (AnonymousClass3DP) r2.Aak.get();
    }

    public static void A3F(C88834as r1, C64333Db r2, C107695bk r3, C91454jw r4) {
        r4.A02 = (C181728nE) r1.A1C.get();
        r4.A01 = (AnonymousClass5UW) r2.A4T.get();
        r4.A03 = (C105145Tt) r2.A4V.get();
        r4.A06 = (C103115Lp) r3.A8P.get();
        r4.A00 = (C29201iR) r2.A4U.get();
        r4.A04 = (C181798nL) r1.A1N.get();
    }

    public static void A3H(C88834as r1, C64333Db r2, C107695bk r3, AnonymousClass33K r4, RegisterPhone registerPhone) {
        registerPhone.A0I = r4;
        registerPhone.A0A = (C116985rC) r2.AOi.get();
        registerPhone.A0K = (C66523Lt) r2.ALF.get();
        registerPhone.A0T = r3.ANk();
        registerPhone.A0N = r1.AD3();
        registerPhone.A0L = (C619933b) r2.ALS.get();
        registerPhone.A0F = (C52282lE) r2.A5z.get();
        registerPhone.A0J = (C158857kf) r2.AGE.get();
        registerPhone.A0G = (AnonymousClass314) r2.A6v.get();
        registerPhone.A0O = (C55092pm) r2.AZm.get();
        registerPhone.A0H = (AnonymousClass33T) r2.Aaf.get();
        registerPhone.A0P = (AnonymousClass2QW) r2.A8H.get();
        registerPhone.A0B = (C116985rC) r2.AOl.get();
    }

    public static void A3I(C88834as r1, C64333Db r2, C107695bk r3, C60152y5 r4, RegisterPhone registerPhone) {
        registerPhone.A0M = r4;
        registerPhone.A0Q = (C53282mq) r2.AI9.get();
        registerPhone.A0Y = C72343dZ.A00(r3.ACF);
        registerPhone.A0X = C72343dZ.A00(r2.AbO);
        registerPhone.A0W = C72343dZ.A00(r3.A9G);
        registerPhone.A0V = C72343dZ.A00(r2.A0S);
        registerPhone.A0C = (AnonymousClass5M6) r1.A2B.get();
        registerPhone.A0D = (AnonymousClass5EC) r1.A2C.get();
    }

    public static void A3J(C88834as r1, C64333Db r2, C614930z r3, C97674z3 r4) {
        r4.A07 = r3;
        r4.A0L = (C56912sl) r2.ATe.get();
        C64333Db r12 = r1.A4Z;
        C49552gi Anh = r12.Anh();
        r4.A0N = new AnonymousClass2P0((AnonymousClass33p) r12.Aaj.get(), Anh, (C153017aX) r12.A00.A0h.get());
    }

    public static void A3M(C88834as r1, C64333Db r2, C89634eX r3, Object obj) {
        r3.A0B = (C64773Ex) obj;
        r3.A0D = (AnonymousClass5ZU) r2.AaA.get();
        r3.A08 = (C56962sq) r2.A2b.get();
        r3.A0C = (C29421in) r2.A6P.get();
        r3.A0A = (C44772Xk) r2.A6I.get();
        r3.A0N = (C620733j) r2.AbU.get();
        r3.A09 = (C29301ib) r2.A57.get();
        r3.A0G = r1.ABp();
        r3.A0O = (C29241iV) r2.AGn.get();
        r3.A0M = (C53592nL) r2.A6M.get();
        r3.A0Q = (AnonymousClass2ML) r2.AIy.get();
        r3.A07 = (AnonymousClass64J) r2.AEN.get();
    }

    public static void A3N(C88834as r5, C64333Db r6, AnonymousClass5ZR r7, MessageReplyActivity messageReplyActivity) {
        messageReplyActivity.A0a = r7;
        messageReplyActivity.A1M = (C105215Ua) r6.A00.A3n.get();
        messageReplyActivity.A1H = (AnonymousClass5XO) r6.A00.A7B.get();
        messageReplyActivity.A0J = (C105035Th) r6.A3s.get();
        messageReplyActivity.A0z = (C49652gs) r6.A1G.get();
        messageReplyActivity.A0K = (C620433g) r6.A3v.get();
        messageReplyActivity.A17 = (AnonymousClass33O) r6.AX1.get();
        C64333Db r1 = r5.A4Z;
        messageReplyActivity.A15 = new AvatarReactionRepository((C55862r2) r1.A1T.get(), new AnonymousClass10E((C56932sn) r1.AXB.get(), (C49932hK) r1.A1d.get(), C69713Yc.A00()), (C49942hL) r5.A06.get(), C69723Yd.A00(), C69713Yc.A00());
    }

    public static void A3O(C88834as r1, C64333Db r2, C96924xG r3) {
        r3.A0C = (AnonymousClass31C) r2.AKw.get();
        r3.A0H = (C989053r) r2.AJl.get();
        r3.A06 = (C56332ro) r2.A6Q.get();
        r3.A0A = (C59862xc) r2.APF.get();
        r3.A0G = (C60152y5) r2.AVn.get();
        r3.A0D = (C56842se) r2.ANr.get();
        r3.A07 = (C613330g) r2.A6S.get();
        r3.A01 = (C100995Db) r1.A1Z.get();
        r3.A02 = (C101005Dc) r1.A1a.get();
        r3.A03 = (C44142Uv) r1.A1b.get();
        r3.A0E = (AnonymousClass5YD) r2.ANq.get();
    }

    public static void A3Q(C64333Db r1, C107695bk r2, C89644eZ r3, Object obj) {
        r3.A06 = (C56612sH) obj;
        r3.A0B = (C105895Wv) r1.AHN.get();
        r3.A01 = (C56972sr) r1.AJW.get();
        r3.A05 = (AnonymousClass310) r1.A9r.get();
        r3.A07 = (C61072zf) r1.AXI.get();
        r3.A00 = (C111095hX) r1.A0a.get();
        r3.A03 = (AnonymousClass5X8) r1.Aac.get();
        r3.A04 = (C105275Ug) r1.A0q.get();
        r3.A02 = (C101625Fm) r2.A7s.get();
        r3.A0A = (C29321id) r1.AUK.get();
        r3.A09 = (C51072jE) r1.ATh.get();
        r3.A08 = r1.Ajr();
    }

    public static void A3R(C64333Db r1, C107695bk r2, GroupCallParticipantPicker groupCallParticipantPicker) {
        groupCallParticipantPicker.A01 = (C1230066r) r1.A4Q.get();
        groupCallParticipantPicker.A02 = C72343dZ.A00(r1.A0Z);
        groupCallParticipantPicker.A07 = C72343dZ.A00(r1.AOi);
        groupCallParticipantPicker.A04 = C72343dZ.A00(r2.A1a);
        groupCallParticipantPicker.A05 = C72343dZ.A00(r1.A68);
        groupCallParticipantPicker.A03 = C72343dZ.A00(r2.A3Y);
        groupCallParticipantPicker.A06 = C72343dZ.A00(r2.AAR);
    }

    public static void A3S(C64333Db r1, C107695bk r2, C91484k4 r3) {
        r3.A0Q = (C50452iC) r2.ABs.get();
        r3.A0N = (C66543Lv) r1.A71.get();
        r3.A0V = (C55832qz) r1.AAY.get();
        r3.A0K = (C56922sm) r1.A58.get();
        r3.A0Z = (C33141sV) r1.AMe.get();
        r3.A0I = (C64773Ex) r1.A6O.get();
        r3.A05 = (C105405Uu) r1.A4W.get();
        r3.A0F = (C106995aW) r1.A4q.get();
        r3.A0G = (AnonymousClass5UK) r1.A4p.get();
        r3.A0Y = (C56072rN) r1.AGN.get();
        r3.A0U = (AnonymousClass1R1) r1.A56.get();
    }

    public static void A3T(C64333Db r1, C107695bk r2, C89634eX r3) {
        r3.A00 = new AnonymousClass5QT();
        r3.A06 = (C48852fa) r2.ABc.get();
        r3.A0I = (C53802nh) r2.A6e.get();
        r3.A0P = (C105055Tk) r1.A0b.get();
        r3.A0F = (C114015mM) r1.A6T.get();
    }

    public static void A3U(C64333Db r1, C107695bk r2, C97674z3 r3) {
        r3.A06 = (C50382i5) r1.AZG.get();
        r3.A09 = (C54292oU) r1.AaB.get();
        r3.A0T = (C106715a2) r2.A72.get();
        r3.A0E = (AnonymousClass4FV) r1.ASY.get();
        r3.A04 = (AnonymousClass5XU) r1.AU0.get();
        r3.A01 = C88744aj.A00;
        r3.A0P = (C56502s5) r2.A5N.get();
        r3.A0J = (C28861ht) r1.AJH.get();
        r3.A05 = (AnonymousClass5WY) r1.AUS.get();
        r3.A0O = (C153017aX) r2.A0h.get();
    }

    public static void A3W(C64333Db r1, C89654ea r2) {
        r2.A04 = (AnonymousClass4FS) r1.AbX.get();
        r2.A0D = (AnonymousClass1VX) r1.A07.get();
        r2.A05 = (C69263Wi) r1.AG7.get();
        r2.A03 = (C55682qk) r1.A75.get();
        r2.A04 = (C64393Dh) r1.AS1.get();
        r2.A0C = (AnonymousClass5Y0) r1.A8o.get();
        r2.A06 = (C66663Mh) r1.AUd.get();
        r2.A08 = (C620633i) r1.AYG.get();
        r2.A09 = (AnonymousClass33p) r1.Aaj.get();
        r2.A07 = (C29441ip) r1.A68.get();
        r2.A0A = (C54412og) r1.Aam.get();
    }

    public static void A3Y(C64333Db r1, C89644eZ r2, C56612sH r3) {
        r2.A06 = r3;
        r2.A0B = (C105895Wv) r1.AHN.get();
        r2.A01 = (C56972sr) r1.AJW.get();
        r2.A05 = (AnonymousClass310) r1.A9r.get();
        r2.A07 = (C61072zf) r1.AXI.get();
        r2.A00 = (C111095hX) r1.A0a.get();
        r2.A03 = (AnonymousClass5X8) r1.Aac.get();
        r2.A04 = (C105275Ug) r1.A0q.get();
        r2.A02 = (C101625Fm) r1.A00.A7s.get();
        r2.A0A = (C29321id) r1.AUK.get();
        r2.A09 = (C51072jE) r1.ATh.get();
        r2.A08 = r1.Ajr();
    }

    public static void A3Z(C64333Db r1, C91484k4 r2) {
        r2.A00 = new AnonymousClass5QT();
        r2.A0S = (C195219Wq) r1.AQK.get();
        r2.A0L = (C56982ss) r1.A5B.get();
        r2.A03 = (C621033m) r1.AZL.get();
    }

    public static void A3a(C64333Db r1, AnonymousClass5ZU r2, MessageReplyActivity messageReplyActivity) {
        messageReplyActivity.A0R = r2;
        messageReplyActivity.A0O = (C56962sq) r1.A2b.get();
        messageReplyActivity.A1G = (C55832qz) r1.AAY.get();
        messageReplyActivity.A18 = (C29361ih) r1.AX3.get();
        messageReplyActivity.A0w = (C49632gq) r1.A00.A2E.get();
        messageReplyActivity.A0n = (C55922r8) r1.A00.A9d.get();
        messageReplyActivity.A1J = (C33141sV) r1.AMe.get();
        messageReplyActivity.A0Z = (C56512s6) r1.AK3.get();
        messageReplyActivity.A19 = (C56932sn) r1.AXB.get();
        messageReplyActivity.A0o = (C53202mi) r1.AXV.get();
    }

    public static void A3b(C64333Db r1, AnonymousClass4FV r2, MessageReplyActivity messageReplyActivity) {
        messageReplyActivity.A0h = r2;
        messageReplyActivity.A0M = (C50482iF) r1.AVq.get();
        messageReplyActivity.A0I = (C621033m) r1.AZL.get();
        messageReplyActivity.A0e = r1.AkL();
        messageReplyActivity.A10 = (C55862r2) r1.A1T.get();
        messageReplyActivity.A0L = (AnonymousClass5XF) r1.A4f.get();
        messageReplyActivity.A0r = (C55972rD) r1.AJk.get();
        messageReplyActivity.A0s = (C48682fI) r1.AKH.get();
    }

    public static void A3c(C64333Db r1, MessageReplyActivity messageReplyActivity, C989053r r3) {
        messageReplyActivity.A1I = r3;
        messageReplyActivity.A13 = (C54822pL) r1.A00.AAD.get();
        messageReplyActivity.A0N = (AnonymousClass2PX) r1.AVp.get();
    }

    public static void A3d(C89654ea r2) {
        r2.A5x(r2.A00, r2.A05);
    }

    public static void A3e(C89654ea r2) {
        r2.A05.A0G(0, R.string.f11nameremoved);
    }

    public static void A3f(C89654ea r4) {
        r4.A09.A1F(System.currentTimeMillis() + 604800000);
    }

    public static void A3h(C50472iE r1, Object obj, int i, int i2) {
        r1.A01(new C1891190b(obj, i), i2);
    }

    public static void A3i(C89164br r1) {
        r1.A00 = new AnonymousClass5QT();
    }

    public static void A3n(QuickContactActivity quickContactActivity) {
        C105195Ty r0 = quickContactActivity.A0n;
        r0.A00();
        r0.A01();
    }

    public static void A3o(ChangeNumber changeNumber) {
        C102735Kb r1 = changeNumber.A0F;
        r1.A01 = C57612tv.A00(r1.A03);
        C102735Kb r12 = changeNumber.A0F;
        r12.A00 = C57612tv.A00(r12.A02);
        C102735Kb r13 = changeNumber.A0I;
        r13.A01 = C57612tv.A00(r13.A03);
        C102735Kb r14 = changeNumber.A0I;
        r14.A00 = C57612tv.A00(r14.A02);
    }

    public static void A3p(RegisterName registerName, long j) {
        registerName.A1Q.A01();
        registerName.A1O.A06("profile_photo", (String) null, registerName.A1Q.A00().getString("google_migrate_ios_funnel_id", (String) null), registerName.A1Q.A00().getString("google_migrate_ios_export_duration", (String) null), j);
    }

    public static void A3q(C108935do r1, StringBuilder sb) {
        sb.append("/sms_wait=");
        sb.append(r1.A0N);
        sb.append(";voice_wait=");
        sb.append(r1.A0P);
        sb.append(";wa_old_wait=");
        sb.append(r1.A0Q);
        sb.append(";email_otp_wait=");
        sb.append(r1.A0E);
        sb.append(";retry_after=");
    }

    public static void A3r(VerifyPhoneNumber verifyPhoneNumber) {
        verifyPhoneNumber.A0z.A03("failTooMany");
        verifyPhoneNumber.A0z.A02("verify-tmg");
    }

    public static void A3t(VerifyPhoneNumber verifyPhoneNumber, String str) {
        verifyPhoneNumber.A10.A05(str, System.currentTimeMillis() + verifyPhoneNumber.A0D);
        verifyPhoneNumber.A7d(verifyPhoneNumber.A0D, str);
    }

    public static void A3v(ProfileCheckpointRegisterName profileCheckpointRegisterName, long j) {
        profileCheckpointRegisterName.A12.A01();
        profileCheckpointRegisterName.A10.A06("profile_photo", (String) null, profileCheckpointRegisterName.A12.A00().getString("google_migrate_ios_funnel_id", (String) null), profileCheckpointRegisterName.A12.A00().getString("google_migrate_ios_export_duration", (String) null), j);
    }

    public static void A3w(TextStatusComposerActivity textStatusComposerActivity, float f, float f2, int i) {
        textStatusComposerActivity.A09.animate().translationY(f).alpha(f2).setDuration((long) 200).setListener(new AnonymousClass67F(textStatusComposerActivity, i, 4));
    }

    public static void A3x(Object obj, boolean z) {
        C112715kB r0 = (C112715kB) obj;
        r0.A02 = z;
        C185668u3 r02 = r0.A00;
        if (r02 != null) {
            r02.setShouldHideBanner(z);
        }
    }

    public static boolean A40(C89654ea r0) {
        return r0.A07.A0F();
    }

    public static boolean A41(C89654ea r1) {
        return r1.A0D.A0X(3792);
    }

    public static boolean A42(C89654ea r1) {
        return r1.A0D.A0X(3871);
    }

    public static boolean A43(C89654ea r1) {
        return r1.A0D.A0X(5012);
    }

    public static boolean A44(C89654ea r1) {
        return r1.A0D.A0X(5868);
    }

    public static boolean A45(C89644eZ r0) {
        return r0.A01.A0Y();
    }

    public static boolean A46(C89644eZ r0, C95814uZ r1) {
        return r0.A01.A0a(r1);
    }

    public static boolean A48(GroupChatInfoActivity groupChatInfoActivity) {
        return groupChatInfoActivity.A0O.A0D(groupChatInfoActivity.A1h);
    }

    public static boolean A49(GroupChatInfoActivity groupChatInfoActivity) {
        return groupChatInfoActivity.A0O.A0C(groupChatInfoActivity.A1h);
    }

    public static boolean A4A(GroupChatInfoActivity groupChatInfoActivity) {
        return groupChatInfoActivity.A0P.A01(groupChatInfoActivity.A19);
    }

    public static boolean A4B(InAppBugReportingActivity inAppBugReportingActivity) {
        InAppBugReportingViewModel inAppBugReportingViewModel = (InAppBugReportingViewModel) inAppBugReportingActivity.A0Q.getValue();
        if (!inAppBugReportingViewModel.A0A.A0X(4697)) {
            return false;
        }
        Object A07 = inAppBugReportingViewModel.A02.A07();
        C134786jc r1 = C134786jc.A00;
        if (C162457s7.A0P(A07, r1) || C162457s7.A0P(inAppBugReportingViewModel.A00.A07(), r1) || C162457s7.A0P(inAppBugReportingViewModel.A01.A07(), r1)) {
            return true;
        }
        return false;
    }

    public static boolean A4E(Settings settings) {
        return settings.A0l.A00.A0X(4472);
    }

    /* renamed from: A5p */
    public final C116865qz A5s() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new C116865qz(this);
                }
            }
        }
        return this.A02;
    }

    public void A5q() {
        new C116865qz(this);
    }

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            A5s().generatedComponent();
        }
    }

    public AnonymousClass4SG(int i) {
        super(i);
        AnonymousClass68W.A00(this, 3);
    }

    public static View A2Q(MenuItem menuItem) {
        menuItem.setActionView(R.layout.f8nameremoved);
        C107295b4.A02(menuItem.getActionView());
        return menuItem.getActionView();
    }

    public static View A2R(C009707r r1) {
        return r1.findViewById(R.id.search_holder);
    }

    public static AnonymousClass0R8 A2S(C009707r r0, Toolbar toolbar) {
        r0.setSupportActionBar(toolbar);
        AnonymousClass0R8 supportActionBar = r0.getSupportActionBar();
        C626936e.A06(supportActionBar);
        return supportActionBar;
    }

    public static Toolbar A2T(Activity activity) {
        return (Toolbar) C005205m.A00(activity, R.id.toolbar);
    }

    public static AnonymousClass3DZ A2U(AnonymousClass4SG r0) {
        return (AnonymousClass3DZ) r0.A5s().generatedComponent();
    }

    public static AnonymousClass3DZ A2V(AnonymousClass4SG r0) {
        return (AnonymousClass3DZ) r0.A5s().generatedComponent();
    }

    public static C88834as A2W(AnonymousClass4SG r0) {
        return (C88834as) ((AnonymousClass3DZ) r0.A5s().generatedComponent());
    }

    public static C88834as A2X(AnonymousClass4SG r0) {
        return (C88834as) ((AnonymousClass3DZ) r0.A5s().generatedComponent());
    }

    public static C64333Db A2Y(AnonymousClass4SG r0) {
        return ((C88834as) ((AnonymousClass3DZ) r0.A5s().generatedComponent())).A4Z;
    }

    public static C159027ky A2Z(C64333Db r0) {
        return (C159027ky) r0.AFv.get();
    }

    public static AnonymousClass5XU A2d(C64333Db r0) {
        return (AnonymousClass5XU) r0.AU0.get();
    }

    public static C66523Lt A2n(C64333Db r0) {
        return (C66523Lt) r0.ALF.get();
    }

    public static C55092pm A2o(C64333Db r0) {
        return (C55092pm) r0.AZm.get();
    }

    public static SearchFragment A2r(C003203q r1) {
        return (SearchFragment) r1.getSupportFragmentManager().A0D("search_fragment");
    }

    public static String A2v(C620733j r1, String str, String str2) {
        return r1.A0I(AnonymousClass36l.A0C(str, str2));
    }

    public static void A34(Activity activity) {
        C107405bG.A07(activity, AnonymousClass5Yj.A02(activity, R.attr.f3nameremoved, R.color.f5nameremoved));
    }

    public static void A35(Activity activity) {
        activity.startActivity(C627736r.A01(activity));
        C05680Um.A00(activity);
    }

    public static void A36(Activity activity) {
        activity.startActivity(C627736r.A03(activity));
        activity.finish();
    }

    public static void A37(Activity activity) {
        activity.getWindow().addFlags(Integer.MIN_VALUE);
    }

    public static void A38(Activity activity, Transition transition, TransitionSet transitionSet, View view) {
        transition.addTarget(view);
        transitionSet.addTransition(transition);
        activity.getWindow().setReturnTransition(transitionSet);
    }

    public static void A3A(TextView textView, MessageDetailsActivity messageDetailsActivity, long j) {
        textView.setText(messageDetailsActivity.A74(j));
    }

    public static void A3B(C08310eF r1) {
        ((C89654ea) r1.A0R()).Bot(R.string.f11nameremoved);
    }

    public static void A3C(C116985rC r0) {
        ((C183538qC) r0.A04()).get();
    }

    public static void A3G(C88834as r1, C64333Db r2, C107695bk r3, C93544ok r4, AnonymousClass4C1 r5) {
        r4.A03 = (AnonymousClass5Ul) r5.get();
        r4.A0C = (C66533Lu) r2.AFp.get();
        r4.A06 = (C29421in) r2.A6P.get();
        r4.A04 = (C29301ib) r2.A57.get();
        r4.A0D = (C72303dV) r2.AMC.get();
        r4.A0B = (C55062pj) r2.A9E.get();
        r4.A0A = (C49482gb) r2.A9A.get();
        r4.A0G = (AnonymousClass5TZ) r3.AB9.get();
        r4.A0E = (C29241iV) r2.AGn.get();
        r4.A02 = (AnonymousClass5M7) r1.A0T.get();
        r4.A01 = C88744aj.A00;
        r4.A09 = new C93754pF(r1.ABv());
    }

    public static void A3K(C88834as r1, C64333Db r2, C91484k4 r3) {
        r3.A0R = (C153087ae) r2.AQ7.get();
        r3.A06 = (C105145Tt) r2.A4V.get();
        r3.A04 = (AnonymousClass5T7) r2.A4a.get();
        r3.A0J = (AnonymousClass5ZR) r2.Aag.get();
        r3.A0M = (C28891hw) r2.A6s.get();
        r3.A0O = (C56892sj) r2.AGm.get();
        r3.A02 = (C107895c5) r2.A00.A0I.get();
        r3.A07 = (AnonymousClass5X1) r2.A3p.get();
        r3.A0W = (AnonymousClass30V) r2.ANL.get();
        r3.A0A = (C1224564l) r1.A34.get();
        r3.A0b = C72343dZ.A00(r2.A82);
    }

    public static void A3L(C88834as r1, C64333Db r2, C91484k4 r3) {
        r3.A0H = r1.ABo();
        r3.A08 = (C1224464k) r1.A35.get();
        r3.A0C = (C1224664m) r1.A36.get();
        r3.A0P = (C52472lX) r2.AXh.get();
    }

    public static void A3P(C88834as r1, C64333Db r2, MessageReplyActivity messageReplyActivity) {
        messageReplyActivity.A1O = r1.ADL();
        messageReplyActivity.A16 = (C97084xb) r2.A00.A0l.get();
        messageReplyActivity.A0j = r1.ACT();
        messageReplyActivity.A1A = (C49932hK) r2.A1d.get();
        messageReplyActivity.A0v = (C194079Rm) r2.A00.A8f.get();
        messageReplyActivity.A1E = (AnonymousClass2QZ) r2.A00.ABQ.get();
        messageReplyActivity.A1B = (C49252gE) r2.A00.ABM.get();
        messageReplyActivity.A0u = r1.ACq();
        messageReplyActivity.A0i = (AnonymousClass5MZ) r2.A00.A7L.get();
        messageReplyActivity.A0c = (AnonymousClass5RE) r2.A00.A3H.get();
        messageReplyActivity.A0b = (C53412n3) r2.A93.get();
    }

    public static void A3V(C64333Db r1, C107695bk r2, C97674z3 r3) {
        r3.A03 = (C106175Xx) r1.ARx.get();
        r3.A0S = (C106675Zy) r1.A73.get();
        r3.A0G = (C53202mi) r1.AXV.get();
        r3.A0D = (C56142rU) r1.A05.get();
        r3.A0F = (C53652nR) r1.A02.get();
        r3.A0C = (AnonymousClass1VW) r1.A03.get();
        r3.A0B = (C50102hd) r2.A50.get();
        r3.A08 = (C53602nM) r2.A2g.get();
        r3.A0Q = (C102305Ii) r2.A9R.get();
        r3.A02 = (C53962nx) r1.A4i.get();
        r3.A0M = (AnonymousClass317) r1.ATf.get();
    }

    public static void A3X(C64333Db r1, C89654ea r2, AnonymousClass4C1 r3) {
        r2.A0D = (AnonymousClass1VX) r3.get();
        r2.A05 = (C69263Wi) r1.AG7.get();
        r2.A03 = (C55682qk) r1.A75.get();
        r2.A04 = (C64393Dh) r1.AS1.get();
        r2.A0C = (AnonymousClass5Y0) r1.A8o.get();
        r2.A06 = (C66663Mh) r1.AUd.get();
        r2.A08 = (C620633i) r1.AYG.get();
        r2.A09 = (AnonymousClass33p) r1.Aaj.get();
        r2.A07 = (C29441ip) r1.A68.get();
        r2.A0A = (C54412og) r1.Aam.get();
        r2.A0B = (AnonymousClass487) r1.A00.A9c.get();
    }

    public static void A3g(C89654ea r1, C183538qC r2) {
        C106035Xj r22 = (C106035Xj) r2.get();
        boolean z = true;
        if (!C106035Xj.A01(r1.A00)) {
            z = false;
        }
        r22.A05 = z;
        r22.A04 = z;
        r22.A03 = z;
    }

    public static void A3j(ThumbnailButton thumbnailButton, PopupNotification popupNotification, C624134x r5) {
        thumbnailButton.A02 = popupNotification.getResources().getDimension(R.dimen.f6nameremoved);
        thumbnailButton.A01 = 1.0f;
        thumbnailButton.A03 = 1711276032;
        C33141sV r2 = popupNotification.A1L;
        r2.A0A(thumbnailButton, r5, new C116315q5(thumbnailButton, r2, R.drawable.media_location));
        thumbnailButton.setOnClickListener(popupNotification.A06);
    }

    public static void A3k(UserJid userJid, VoipActivityV2 voipActivityV2, boolean z) {
        C107285b3 r0;
        CallInfo A7D = voipActivityV2.A7D();
        if (A7D != null && A7D.callState != CallState.NONE && (r0 = voipActivityV2.A16) != null) {
            r0.A0Y(userJid, A7D, z);
        }
    }

    public static void A3m(C105335Un r0) {
        r0.A02().delete();
    }

    public static void A3u(AnonymousClass5UQ r2, String str, long j) {
        r2.A05(str, System.currentTimeMillis() + j);
    }

    public static void A3y(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append("/retryAfter=");
    }

    public static boolean A3z(C003203q r3) {
        C08310eF A0D;
        C08270df supportFragmentManager = r3.getSupportFragmentManager();
        if (supportFragmentManager.A07() != 1 || (A0D = supportFragmentManager.A0D("search_fragment")) == null || !A0D.A19()) {
            return false;
        }
        return true;
    }

    public static boolean A47(AnonymousClass33p r1, C108935do r2, VerifyPhoneNumber verifyPhoneNumber, String str) {
        AnonymousClass36l.A0O(r1, str);
        verifyPhoneNumber.A0z.A03("failTooMany");
        verifyPhoneNumber.A0z.A02("verify-tma");
        return AnonymousClass5VK.A01(r2.A0L);
    }

    public static boolean A4C(NewsletterInfoActivity newsletterInfoActivity) {
        return newsletterInfoActivity.A7K().A00(newsletterInfoActivity.A7G());
    }

    public static boolean A4D(VerifyPhoneNumber verifyPhoneNumber) {
        int A74 = verifyPhoneNumber.A74();
        if (A74 == 13 || A74 == 14) {
            return true;
        }
        return false;
    }

    public C17190ui B6u() {
        return AnonymousClass5VY.A00(this, super.B6u());
    }

    public final Object generatedComponent() {
        return A5s().generatedComponent();
    }

    public AnonymousClass4SG() {
        AnonymousClass68W.A00(this, 3);
    }
}
