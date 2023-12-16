package X;

import android.os.Handler;
import android.os.Message;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.HomeActivity;
import com.whatsapp.R;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.calling.views.VoipCallFooter;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;
import java.util.Map;

/* renamed from: X.69w  reason: invalid class name and case insensitive filesystem */
public class C1238169w implements Handler.Callback {
    public Object A00;
    public final int A01;

    public C1238169w(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean handleMessage(Message message) {
        C102995Lb r0;
        Handler handler;
        int i;
        CallState callState;
        AnonymousClass5YG r02;
        CallState callState2;
        VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2;
        C105315Uk r03;
        int A002;
        VoipCallFooter voipCallFooter;
        switch (this.A01) {
            case 0:
                HomeActivity homeActivity = (HomeActivity) this.A00;
                if (message.what != 0) {
                    return true;
                }
                homeActivity.A7S();
                C117645sG.A00(homeActivity.A05, homeActivity, 27);
                return true;
            case 1:
                C107285b3 r3 = (C107285b3) this.A00;
                CallInfo callInfo = Voip.getCallInfo();
                int i2 = message.what;
                boolean A1U = AnonymousClass000.A1U(i2, 4);
                if (C627436k.A0O(callInfo) || A1U) {
                    if (i2 == 0) {
                        Log.i("voip/call/not-accept-timeout");
                        if (callInfo.isGroupCall && ((callState = callInfo.callState) == CallState.CALLING || callState == CallState.PRE_ACCEPT_RECEIVED)) {
                            return true;
                        }
                        i = 7;
                    } else if (i2 == 1) {
                        Log.i("voip/call/accepted-but-not-active-timeout");
                        if (callInfo.isAudioChat()) {
                            r3.A0p(AnonymousClass001.A0s(), 34);
                        }
                        i = 8;
                    } else if (i2 == 2) {
                        Log.i("voip/call/send-call-offer-timeout");
                        if (r3.A2N.A08(true) != 0) {
                            return true;
                        }
                        r3.A0e(callInfo, r3.A1W.getString(R.string.f11nameremoved), 9);
                        return true;
                    } else if (i2 == 3) {
                        Log.i("voip/call/busy-tone-timeout");
                        i = 10;
                    } else if (i2 != 4) {
                        return false;
                    } else {
                        Log.i("voip/call/ringtone-timeout");
                        r3.A27.A03();
                        return true;
                    }
                    r3.A0e(callInfo, (String) null, i);
                    return true;
                }
                Log.e("voip/callTimeoutHandler we are not in an active call");
                return false;
            case 2:
                C107285b3 r2 = (C107285b3) this.A00;
                int i3 = message.what;
                if (i3 != 0) {
                    if (i3 != 1) {
                        return false;
                    }
                    if (r2.A2L.A01()) {
                        return true;
                    }
                    r2.A1m.A05();
                    return true;
                } else if (!r2.A2L.A03()) {
                    return true;
                } else {
                    if (C107285b3.A3T.get() > 0) {
                        r2.A0B();
                        return true;
                    }
                    Log.i("voip/service/stopSelfHandler stopSelf now");
                    r2.A1R = true;
                    r2.A29.A00.obtainMessage(2).sendToTarget();
                    return true;
                }
            case 3:
                C116655qe r32 = (C116655qe) this.A00;
                int i4 = message.what;
                if (i4 == 1) {
                    Log.e("voip/VideoPortManager/Camera evicted");
                    CallGridViewModel callGridViewModel = r32.A02;
                    if (callGridViewModel == null) {
                        return true;
                    }
                    C97174xk r4 = callGridViewModel.A0R;
                    AnonymousClass5XK A08 = r4.A08();
                    CallState callState3 = A08.A07;
                    if ((callState3 != CallState.ACTIVE && callState3 != CallState.LINK && callState3 != CallState.CONNECTED_LONELY) || A08.A0D) {
                        return true;
                    }
                    C102995Lb r04 = (C102995Lb) A08.A02.get(A08.A06);
                    if ((r04 != null && !r04.A09) || (r0 = A08.A03) == null || r0.A06 != 1) {
                        return true;
                    }
                    C107285b3 r05 = r4.A03;
                    if (r05 != null) {
                        C86624Kv.A1S(r05.A13, 6);
                    }
                    C86654Ky.A1H(callGridViewModel.A0x);
                    return true;
                } else if (i4 != 2) {
                    return true;
                } else {
                    UserJid A0G = r32.A05.A0G();
                    Map map = r32.A0A;
                    if (!map.containsKey(A0G)) {
                        return true;
                    }
                    r32.A05(A0G);
                    r32.A03((AnonymousClass8KC) map.get(A0G));
                    return true;
                }
            case 4:
                MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A00;
                if (mediaViewFragment.A1g == null) {
                    return true;
                }
                if (mediaViewFragment.A01 == 1) {
                    VoiceNoteSeekBar voiceNoteSeekBar = mediaViewFragment.A1o;
                    if (voiceNoteSeekBar == null || voiceNoteSeekBar.getMax() <= 0) {
                        C86664Kz.A0y(mediaViewFragment).Bot(R.string.f11nameremoved);
                    } else {
                        int min = Math.min(mediaViewFragment.A1g.A02(), mediaViewFragment.A1o.getMax());
                        int i5 = min / 1000;
                        if (mediaViewFragment.A00 / 1000 != i5) {
                            TextView textView = mediaViewFragment.A0B;
                            if (textView != null) {
                                C107565bW.A0I(textView, mediaViewFragment.A0l, (long) i5);
                            }
                            mediaViewFragment.A00 = min;
                        }
                        mediaViewFragment.A1o.setProgress(min);
                    }
                }
                if (!mediaViewFragment.A0R().isFinishing() && mediaViewFragment.A01 == 1 && mediaViewFragment.A1g.A0F()) {
                    handler = mediaViewFragment.A08;
                    if (handler == null) {
                        return true;
                    }
                } else if (mediaViewFragment.A01 == 2) {
                    return true;
                } else {
                    Log.i("MediaViewFragment/onViewCreated/audio/set to stop status");
                    VoiceNoteSeekBar voiceNoteSeekBar2 = mediaViewFragment.A1o;
                    if (voiceNoteSeekBar2 != null) {
                        voiceNoteSeekBar2.setProgress(voiceNoteSeekBar2.getMax());
                    }
                    TextView textView2 = mediaViewFragment.A0B;
                    if (textView2 != null) {
                        C107565bW.A0I(textView2, mediaViewFragment.A0l, (long) (mediaViewFragment.A1g.A03() / 1000));
                    }
                    mediaViewFragment.A1b();
                    return true;
                }
                break;
            case 5:
                SearchViewModel searchViewModel = (SearchViewModel) this.A00;
                if (message.what != 0) {
                    return false;
                }
                searchViewModel.A08 = new C105745Wf().A00();
                Runnable runnable = searchViewModel.A0H;
                if (runnable != null) {
                    runnable.run();
                }
                searchViewModel.A0Q.removeMessages(0);
                searchViewModel.A0T();
                return true;
            case 6:
                AnonymousClass564 r1 = (AnonymousClass564) this.A00;
                C104835Sn r06 = r1.A00;
                if (r06 == null) {
                    throw C18270x1.A0S("staticContentPlayer");
                }
                r06.A02();
                r1.A0H();
                return true;
            case 7:
                AnonymousClass563 r5 = (AnonymousClass563) this.A00;
                if (r5.A0S) {
                    if (!r5.A0L && (r02 = r5.A0I) != null && r02.A0a() && r5.A0I.A06() != 0) {
                        int A0A = (int) (C18290x4.A0A(r5.A0I.A05()) / ((long) r5.A0I.A06()));
                        r5.A0t.setProgress(A0A);
                        if (!r5.A0T) {
                            r5.A0u.setProgress(A0A);
                            r5.A0w.setText(AnonymousClass5VT.A01(r5.A15, r5.A16, (long) r5.A0I.A05()));
                        }
                    }
                    handler = r5.A0W;
                    break;
                } else {
                    return true;
                }
            default:
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A00;
                if (message.what == 9) {
                    voipActivityV2.finish();
                    return true;
                }
                CallInfo A7D = voipActivityV2.A7D();
                if (A7D == null || (callState2 = A7D.callState) == CallState.NONE) {
                    return true;
                }
                int i6 = message.what;
                if (i6 == 1) {
                    voipActivityV2.A7O();
                    return true;
                } else if (i6 != 2) {
                    if (i6 == 3) {
                        Log.d("VoipActivityV2/onCreate HANDLER_WHAT_HIDE_BUTTONS");
                        if (!voipActivityV2.A2I) {
                            if (!voipActivityV2.A2K || (voipCallControlBottomSheetV2 = voipActivityV2.A1t) == null) {
                                return true;
                            }
                            if (!voipCallControlBottomSheetV2.A1c() && !voipCallControlBottomSheetV2.A1d()) {
                                VoipCallControlBottomSheetV2 voipCallControlBottomSheetV22 = voipActivityV2.A1t;
                                if (!voipCallControlBottomSheetV22.A0i || (r03 = voipCallControlBottomSheetV22.A0N) == null || !((A002 = r03.A00()) == 2 || A002 == 1)) {
                                    C105315Uk r12 = voipCallControlBottomSheetV22.A0N;
                                    if (r12 == null || !r12.A0I.A0d) {
                                        return true;
                                    }
                                    r12.A03(5);
                                    voipCallControlBottomSheetV22.A1U();
                                    return true;
                                }
                            }
                        }
                        voipActivityV2.A0D.removeMessages(3);
                        voipActivityV2.A0D.sendEmptyMessageDelayed(3, 5000);
                        return true;
                    } else if (i6 == 7) {
                        DialogFragment dialogFragment = voipActivityV2.A0a;
                        if (dialogFragment == null || !dialogFragment.A16()) {
                            return true;
                        }
                        voipActivityV2.A7C("NonActivityDismissDialogFragment");
                        voipActivityV2.A0a = null;
                        return true;
                    } else if (i6 == 8) {
                        DialogFragment dialogFragment2 = voipActivityV2.A0a;
                        if (dialogFragment2 == null) {
                            return true;
                        }
                        voipActivityV2.A7A(dialogFragment2, "NonActivityDismissDialogFragment");
                        return true;
                    } else if (i6 == 10) {
                        voipActivityV2.BsG(A7D);
                        return true;
                    } else if (i6 != 11 || callState2 != CallState.ACTIVE || A7D.callEnding || voipActivityV2.A16 == null) {
                        return true;
                    } else {
                        Log.i("voip/VoipActivityV2/commonHandler STOP_CAMERA");
                        C102995Lb r13 = A7D.self;
                        C102995Lb defaultPeerInfo = A7D.getDefaultPeerInfo();
                        if ((defaultPeerInfo != null && !defaultPeerInfo.A09) || r13.A06 != 1) {
                            return true;
                        }
                        voipActivityV2.A2N = true;
                        C86624Kv.A1S(voipActivityV2.A16.A13, 6);
                        VoipCallControlBottomSheetV2 voipCallControlBottomSheetV23 = voipActivityV2.A1t;
                        if (voipCallControlBottomSheetV23 == null || (voipCallFooter = voipCallControlBottomSheetV23.A0V) == null) {
                            return true;
                        }
                        voipCallFooter.setToggleVideoButtonSelected(true);
                        return true;
                    }
                } else if (voipActivityV2.A0b == null) {
                    return true;
                } else {
                    voipActivityV2.A7C("EndCallConfirmationDialogFragment");
                    voipActivityV2.A0b = null;
                    return true;
                }
        }
        handler.sendEmptyMessageDelayed(0, 50);
        return true;
    }
}
