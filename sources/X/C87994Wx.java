package X;

import android.util.AttributeSet;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.community.communityInfo.viewModels.CAGInfoChatLockViewModel;
import com.whatsapp.info.views.ChatInfoMediaCardV2;
import com.whatsapp.info.views.EncryptionInfoView;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.4Wx  reason: invalid class name and case insensitive filesystem */
public final class C87994Wx extends AnonymousClass0R6 {
    public final C95084sb A00;
    public final C27991fJ A01;
    public final C27991fJ A02;
    public final List A03 = new CopyOnWriteArrayList();

    public void BNf(C05570Ua r8, int i) {
        C89654ea r4;
        C06270Wx r2;
        Object obj;
        int i2;
        AnonymousClass1Hf r5;
        C06270Wx r42;
        Object obj2;
        int i3;
        C162457s7.A0J(r8, 0);
        if (r8 instanceof C88184Xt) {
            C27991fJ r3 = this.A01;
            ((C88184Xt) r8).A00.A08(this.A00, r3, false);
        } else if (r8 instanceof C88234Xy) {
            C27991fJ r32 = this.A01;
            C27991fJ r1 = this.A02;
            AnonymousClass4uO r22 = ((C88234Xy) r8).A00;
            r22.A08(r32, r1);
            r22.A00 = new C114575nG(r22, r32, r1);
            C50932j0 groupDataChangeListeners$community_consumerBeta = r22.getGroupDataChangeListeners$community_consumerBeta();
            AnonymousClass4AQ r0 = r22.A00;
            if (r0 == null) {
                throw C18270x1.A0S("onRefreshListener");
            }
            groupDataChangeListeners$community_consumerBeta.A00(r0);
        } else if (r8 instanceof C88174Xs) {
            C27991fJ r12 = this.A01;
            C95714uJ r02 = ((C88174Xs) r8).A00;
            r02.A00 = r12;
            r02.A08(r12);
        } else if (r8 instanceof C88164Xr) {
            ((C88164Xr) r8).A00.A08(this.A01);
        } else {
            if (r8 instanceof AnonymousClass4Y0) {
                C27991fJ r33 = this.A01;
                C95084sb r23 = this.A00;
                C95724uM r52 = ((AnonymousClass4Y0) r8).A00;
                r52.setupOnClickListener(new AnonymousClass547(r52, r33, r23, 11));
                r4 = r52.A00;
                C22411Nc r03 = (C22411Nc) C124086Ax.A00(r4, r33, r52.getGroupChatInfoViewModelFactory$community_consumerBeta(), 10).A01(C22411Nc.class);
                r52.A01 = r03;
                if (r03 == null) {
                    throw C18270x1.A0S("groupChatInfoViewModel");
                }
                AnonymousClass6C6.A02(r4, r03.A00, new C1214760r(r52), 143);
                C22411Nc r04 = r52.A01;
                if (r04 == null) {
                    throw C18270x1.A0S("groupChatInfoViewModel");
                }
                r2 = r04.A07;
                obj = new C1214860s(r52);
                i2 = MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT;
            } else {
                if (r8 instanceof C88194Xu) {
                    C27991fJ r6 = this.A01;
                    C95084sb r34 = this.A00;
                    C91474k3 r24 = ((C88194Xu) r8).A00;
                    AnonymousClass1Hf r53 = r24.A06;
                    AnonymousClass10x r05 = (AnonymousClass10x) C86624Kv.A0D(r53, r53.A00, r24.getParticipantsViewModelFactory$community_consumerBeta(), r6);
                    r24.A03 = r05;
                    if (r05 == null) {
                        throw C18270x1.A0S("participantsViewModel");
                    }
                    r42 = r05.A0H;
                    obj2 = new AnonymousClass63G(r24, r34, r6);
                    i3 = 138;
                    r5 = r53;
                } else if (r8 instanceof C88204Xv) {
                    C27991fJ r35 = this.A01;
                    C87334Pd r54 = ((C88204Xv) r8).A00;
                    C1224564l mediaCardUpdateHelperFactory$community_consumerBeta = r54.getMediaCardUpdateHelperFactory$community_consumerBeta();
                    ChatInfoMediaCardV2 chatInfoMediaCardV2 = r54.A08;
                    r4 = r54.A07;
                    C162457s7.A0K(r4, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
                    r54.A01 = mediaCardUpdateHelperFactory$community_consumerBeta.B0H((C89644eZ) r4, r35, chatInfoMediaCardV2);
                    C22411Nc r06 = (C22411Nc) C124086Ax.A00(r4, r35, r54.getGroupChatInfoViewModelFactory$community_consumerBeta(), 10).A01(C22411Nc.class);
                    r54.A03 = r06;
                    if (r06 == null) {
                        throw C18270x1.A0S("groupChatInfoViewModel");
                    }
                    AnonymousClass6C6.A02(r4, r06.A00, new C1214560p(r54), 139);
                    C22411Nc r07 = r54.A03;
                    if (r07 == null) {
                        throw C18270x1.A0S("groupChatInfoViewModel");
                    }
                    AnonymousClass6C6.A02(r4, r07.A05, C1001359q.A00(r54, 19), 140);
                    C22411Nc r08 = r54.A03;
                    if (r08 == null) {
                        throw C18270x1.A0S("groupChatInfoViewModel");
                    }
                    r2 = r08.A04;
                    obj = new C1214660q(r54);
                    i2 = 141;
                } else if (r8 instanceof C88214Xw) {
                    C27991fJ r36 = this.A01;
                    C89334cI r25 = ((C88214Xw) r8).A00;
                    C1224664m mediaVisibilityInfoUpdateHelperFactory$community_consumerBeta = r25.getMediaVisibilityInfoUpdateHelperFactory$community_consumerBeta();
                    C89644eZ r55 = r25.A04;
                    r25.A01 = mediaVisibilityInfoUpdateHelperFactory$community_consumerBeta.B0J(r25, r55, r36);
                    r25.setOnClickListener(new C109325eR(r25, 37));
                    r42 = ((CAGInfoChatLockViewModel) AnonymousClass0x9.A0H(r55).A01(CAGInfoChatLockViewModel.class)).A02;
                    obj2 = new C1220062s(r25, r36);
                    i3 = 142;
                    r5 = r55;
                } else if (r8 instanceof C88224Xx) {
                    C27991fJ r56 = this.A01;
                    C95084sb r09 = this.A00;
                    C89354cM r37 = ((C88224Xx) r8).A00;
                    r37.A06 = r56;
                    r37.A05 = r09;
                    C103935Oz B0K = r37.getMuteNotificationsInfoViewUpdateHelperFactory$community_consumerBeta().B0K(C18290x4.A0F(r37), r37, r37.A0A, r56, new AnonymousClass5AQ(r37, 0));
                    r37.A02 = B0K;
                    B0K.A00();
                    r37.A03 = new C113845m5(r37, r56);
                    C28891hw conversationObservers$community_consumerBeta = r37.getConversationObservers$community_consumerBeta();
                    AnonymousClass4FI r010 = r37.A03;
                    if (r010 == null) {
                        throw C18270x1.A0S("conversationObserver");
                    }
                    conversationObservers$community_consumerBeta.A06(r010);
                    return;
                } else if (r8 instanceof C88244Xz) {
                    C27991fJ r13 = this.A01;
                    C95084sb r011 = this.A00;
                    AnonymousClass4Pe r26 = ((C88244Xz) r8).A00;
                    r26.A03 = r13;
                    r26.A02 = r011;
                    C18320x8.A13(r26.A07, r26, 43);
                    return;
                } else {
                    return;
                }
                AnonymousClass6C6.A02(r5, r42, obj2, i3);
                return;
            }
            AnonymousClass6C6.A02(r4, r2, obj, i2);
        }
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        C05570Ua r3;
        C162457s7.A0J(viewGroup, 0);
        switch (i) {
            case 1:
                r3 = new C88184Xt(new EncryptionInfoView(C86614Ku.A0B(viewGroup), (AttributeSet) null));
                break;
            case 2:
                r3 = new C88234Xy(new AnonymousClass4uO(C86614Ku.A0B(viewGroup)));
                break;
            case 3:
                r3 = new C88174Xs(new C95714uJ(C86614Ku.A0B(viewGroup)));
                break;
            case 4:
                r3 = new C88164Xr(new C89344cL(C86614Ku.A0B(viewGroup)));
                break;
            case 5:
                r3 = new AnonymousClass4Y0(new C95724uM(C86614Ku.A0B(viewGroup)));
                break;
            case 6:
                r3 = new C88194Xu(new C91474k3(C86614Ku.A0B(viewGroup)));
                break;
            case 7:
                r3 = new C88204Xv(new C87334Pd(C86614Ku.A0B(viewGroup)));
                break;
            case 8:
                r3 = new C88214Xw(new C89334cI(C86614Ku.A0B(viewGroup)));
                break;
            case 9:
                r3 = new C88224Xx(new C89354cM(C86614Ku.A0B(viewGroup)));
                break;
            case 10:
            case 11:
            case 12:
                return new C88124Xk(new AnonymousClass4PP(C86614Ku.A0B(viewGroup)));
            case 13:
                r3 = new C88244Xz(new AnonymousClass4Pe(C86614Ku.A0B(viewGroup)));
                break;
            default:
                r3 = new C88124Xk(new C19190yw(C86614Ku.A0B(viewGroup)));
                break;
        }
        int dimensionPixelOffset = C18290x4.A0G(viewGroup).getDimensionPixelOffset(R.dimen.f6nameremoved);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        r3.A0H.setLayoutParams(marginLayoutParams);
        return r3;
    }

    public long A0B(int i) {
        return (long) ((C50842ir) this.A03.get(i)).A00;
    }

    public int A0G() {
        return this.A03.size();
    }

    public int getItemViewType(int i) {
        return ((C50842ir) this.A03.get(i)).A00;
    }

    public C87994Wx(C95084sb r2, C27991fJ r3, C27991fJ r4) {
        C18260x0.A0R(r3, r2);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }
}
