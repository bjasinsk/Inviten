import {DateProposal} from '../../types/Date/DateProposal';
import {Meeting} from '../../types/Meeting';
import {PlaceProposal} from '../../types/Place/PlaceProposal';
import {apiClient} from '../api/apiClient';

export const getUserMeetings = async (token: string) => {
    const response = await apiClient.get('/users/meetings', {
        headers: {
            Authorization: `Bearer ${token}`,
        },
    });

    return response.data;
};

export const getUserMeeting = async (token: string, meetingId: string) => {
    const response = await apiClient.get(`/meetings/${meetingId}`, {
        headers: {
            Authorization: `Bearer ${token}`,
        },
    });

    return response.data;
};

export const addUserMeeting = async (token: string, meeting: Meeting) => {
    const response = await apiClient.post('/meetings', meeting, {
        headers: {
            Authorization: `Bearer ${token}`,
        },
    });

    return response.data;
};

export const addUserDateProposal = async (token: string, meetingId: string, proposal: DateProposal) => {
    const response = await apiClient.put(
        `/meetings/${meetingId}/dates`,
        {...proposal},
        {
            headers: {
                Authorization: `Bearer ${token}`,
            },
        },
    );

    return response.data;
};

export const voteOnUserDateProposal = async (token: string, meetingId: string, proposalId: string) => {
    const response = await apiClient.post(
        `/meetings/${meetingId}/dates/${proposalId}/vote`,
        {},
        {
            headers: {
                Authorization: `Bearer ${token}`,
            },
        },
    );
    return response.data;
};

export const unvoteOnUserDateProposal = async (token: string, meetingId: string, proposalId: string) => {
    const response = await apiClient.post(
        `/meetings/${meetingId}/dates/${proposalId}/unvote`,
        {},
        {
            headers: {
                Authorization: `Bearer ${token}`,
            },
        },
    );
    return response.data;
};

export const scheduleUserDateProposal = async (token: string, meetingId: string, proposalId: string) => {
    const response = await apiClient.post(
        `/meetings/${meetingId}/dates/${proposalId}/schedule`,
        {},
        {
            headers: {
                Authorization: `Bearer ${token}`,
            },
        },
    );
    return response.data;
};

export const addUserPlaceProposal = async (token: string, meetingId: string, proposal: PlaceProposal) => {
    const reponse = await apiClient.put(
        `/meetings/${meetingId}/places`,
        {...proposal},
        {
            headers: {
                Authorization: `Bearer ${token}`,
            },
        },
    );

    return reponse.data;
};

export const voteOnUserPlaceProposal = async (token: string, meetingId: string, proposalId: string) => {
    const response = await apiClient.post(
        `/meetings/${meetingId}/places/${proposalId}/vote`,
        {},
        {
            headers: {
                Authorization: `Bearer ${token}`,
            },
        },
    );

    return response.data;
};

export const unvoteOnUserPlaceProposal = async (token: string, meetingId: string, proposalId: string) => {
    const response = await apiClient.post(
        `/meetings/${meetingId}/places/${proposalId}/unvote`,
        {},
        {
            headers: {
                Authorization: `Bearer ${token}`,
            },
        },
    );
    return response.data;
};

export const pickUserPlaceProposal = async (token: string, meetingId: string, proposalId: string) => {
    const response = await apiClient.post(
        `/meetings/${meetingId}/places/${proposalId}/pick`,
        {},
        {
            headers: {
                Authorization: `Bearer ${token}`,
            },
        },
    );
    return response.data;
};

export const inviteUser = async (token: string, meetingId: string, phoneNumber: string) => {
    console.log(phoneNumber);

    const response = await apiClient.put(
        `/meetings/${meetingId}/users/${phoneNumber}`,
        {phoneNumber},
        {
            headers: {
                Authorization: `Bearer ${token}`,
            },
        },
    );
    return response.data;
};

export const changeUserMeetingIcon = async (token: string, meetingId: string, icon: string) => {
    const response = await apiClient.put(
        `/meetings/${meetingId}/icon/${icon}`,
        {icon},
        {
            headers: {
                Authorization: `Bearer ${token}`,
            },
        },
    );
    return response.data;
};

export const changeUserMeetingDuration = async (token: string, meetingId: string, duration: number) => {
    const response = await apiClient.put(
        `/meetings/${meetingId}/duration/${duration}`,
        {duration},
        {
            headers: {
                Authorization: `Bearer ${token}`,
            },
        },
    );
    return response.data;
};
